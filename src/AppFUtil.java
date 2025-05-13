

public class AppFUtil {
    public static void main(String[] args) {
        System.out.println("¿Existe test.txt? " + FUtil.existe(""));
        System.out.println("¿Existe archivo_inexistente.txt? " + FUtil.existe("archivo_inexistente.txt"));
    }
}
