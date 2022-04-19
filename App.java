public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = null;
        try{
            File file = new File("arquivo.txt");
            scanner = new Scanner(file); 
            while(scanner.hasNext()){
                System.out.println(scanner.nextInt());
            }
        }catch (NullPointerException | 
                FileNotFoundExeption ex) {
            ex.printStaxkTrace();
        }catch(InputMismatchExeption ex) {
            Sytem.err.println(ex.getMessage());
        }finally{
            scanner.close();
        }

    System.out.println("o programa foi finalizado.");
    }
}
