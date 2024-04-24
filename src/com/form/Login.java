
package com.form;

import com.client.Service;
import com.event.EventLogin;
import com.event.EventMessage;
import com.event.PublicEvent;
import com.model.Model_Login;
import com.model.Model_Message;
import com.model.Model_Register;
import com.model.Model_User_Account;
import io.socket.client.Ack;


public class Login extends javax.swing.JPanel {

    
    public Login() {
        initComponents();
        init();
    }
    
    private void init(){
        PublicEvent.getInstance().addEventLogin(new EventLogin() {
            @Override
            public void login(Model_Login data) {
               new Thread(new Runnable(){
                   @Override
                   public void run() {
                        PublicEvent.getInstance().getEventMain().showLoading(true);
                        Service.getInstance().getClient().emit("login", data.toJSONObject(),new Ack(){
                            @Override
                            public void call(Object... os) {
                               if(os.length > 0){
                                   boolean action = (Boolean)os[0];
                                   if(action){
                                       Service.getInstance().setUser(new Model_User_Account(os[1]));
                                       PublicEvent.getInstance().getEventMain().showLoading(false);
                                       PublicEvent.getInstance().getEventMain().initChat();
                                   }else{
                                       //password wrong
                                       PublicEvent.getInstance().getEventMain().showLoading(false);
                                   }
                               }else{
                                  PublicEvent.getInstance().getEventMain().showLoading(false); 
                               }
                            }
                            
                        });                      
                    } 
               }).start();
            }

            @Override
            public void register(Model_Register data,EventMessage message) {
                Service.getInstance().getClient().emit("register", data.toJsonObject(),new Ack(){
                    @Override
                    public void call(Object... os) {
                        if(os.length>0){
                            Model_Message ms = new Model_Message((boolean)os[0],os[1].toString());
                            if(ms.isAction()){
                                Model_User_Account user = new Model_User_Account(os[2]);
                                Service.getInstance().setUser(user);
                            }
                            message.callMessage(ms);
                        }
                        
                    }
                   
                });
            }

            @Override
            public void goRegister() {
                slide.show(1);
                
            }

            @Override
            public void goLogin() {
                slide.show(0);
            }

            
        });
    
        P_Login login = new P_Login();
        P_Register register = new P_Register();
        slide.init(login, register);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        slide = new com.swing.PanelSlide();

        setBackground(new java.awt.Color(66, 72, 116));

        jPanel1.setBackground(new java.awt.Color(249, 246, 255));

        slide.setBackground(new java.awt.Color(249, 246, 255));

        javax.swing.GroupLayout slideLayout = new javax.swing.GroupLayout(slide);
        slide.setLayout(slideLayout);
        slideLayout.setHorizontalGroup(
            slideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 387, Short.MAX_VALUE)
        );
        slideLayout.setVerticalGroup(
            slideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 377, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(slide, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(slide, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(211, 211, 211)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(221, 221, 221))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(69, 69, 69))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private com.swing.PanelSlide slide;
    // End of variables declaration//GEN-END:variables
}
