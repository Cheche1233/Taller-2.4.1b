// Clase Bicicleta
public class Bicicleta {
    private String modelo;
    private String color;
    private int tamaño;
    private Rueda ruedaDelantera;
    private Rueda ruedaTrasera;
    private Cuadro cuadro;

    // Clase Rueda (Componente)
    public class Rueda {
        private int tamaño;
        private String tipo;
        private int presión;

        // Getters y setters
        public int getTamaño() {
            return tamaño;
        }

        public void setTamaño(int tamaño) {
            this.tamaño = tamaño;
        }

        public String getTipo() {
            return tipo;
        }

        public void setTipo(String tipo) {
            this.tipo = tipo;
        }

        public int getPresión() {
            return presión;
        }

        public void setPresión(int presión) {
            this.presión = presión;
        }
    }

    // Clase Cuadro (Componente)
    public class Cuadro {
        private String material;
        private int peso;
        private int altura;

        // Getters y setters
        public String getMaterial() {
            return material;
        }

        public void setMaterial(String material) {
            this.material = material;
        }

        public int getPeso() {
            return peso;
        }

        public void setPeso(int peso) {
            this.peso = peso;
        }

        public int getAltura() {
            return altura;
        }

        public void setAltura(int altura) {
            this.altura = altura;
        }
    }

    // Constructor de la clase Bicicleta
    public Bicicleta(String modelo, String color, int tamaño) {
        this.modelo = modelo;
        this.color = color;
        this.tamaño = tamaño;
        // Crear las ruedas y el cuadro al instanciar la bicicleta
        this.ruedaDelantera = new Rueda();
        this.ruedaTrasera = new Rueda();
        this.cuadro = new Cuadro();
    }

    // Getters y setters
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    public Rueda getRuedaDelantera() {
        return ruedaDelantera;
    }

    public void setRuedaDelantera(Rueda ruedaDelantera) {
        this.ruedaDelantera = ruedaDelantera;
    }

    public Rueda getRuedaTrasera() {
        return ruedaTrasera;
    }

    public void setRuedaTrasera(Rueda ruedaTrasera) {
        this.ruedaTrasera = ruedaTrasera;
    }

    public Cuadro getCuadro() {
        return cuadro;
    }

    public void setCuadro(Cuadro cuadro) {
        this.cuadro = cuadro;
    }

    // Clase Principal para la Prueba
    public static void main(String[] args) {
        Bicicleta bicicleta = new Bicicleta("Mountain Bike", "Negro", 26);

        // Configurar la rueda delantera
        bicicleta.ruedaDelantera.setTamaño(26);
        bicicleta.ruedaDelantera.setTipo("Montaña");
        bicicleta.ruedaDelantera.setPresión(30);

        // Configurar la rueda trasera
        bicicleta.ruedaTrasera.setTamaño(26);
        bicicleta.ruedaTrasera.setTipo("Montaña");
        bicicleta.ruedaTrasera.setPresión(30);

        // Configurar el cuadro
        bicicleta.cuadro.setMaterial("Aluminio");
        bicicleta.cuadro.setPeso(10);
        bicicleta.cuadro.setAltura(18);

        // Imprimir la información de la bicicleta
        System.out.println(bicicleta);
    }
}
