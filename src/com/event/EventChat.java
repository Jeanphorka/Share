
package com.event;

import com.model.Model_Receive_Message;
import com.model.Model_Send_Message;


public interface EventChat {
    public void sendMessage(Model_Send_Message data);
    
    public void receiveMessage(Model_Receive_Message data);
    
}
