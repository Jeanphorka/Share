
package testing;

import com.swing.blurHash.BlurHash;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author Knomjean
 */
public class Test {
    public static void main(String[] args) {
         try {
            BufferedImage image = ImageIO.read(new File("C:\\Users\\Knomjean\\OneDrive\\Desktop\\dog.png"));
            String blurhashStr = BlurHash.encode(image);
            System.out.println(blurhashStr);
        } catch (IOException e) {
        }
    }
    
}
