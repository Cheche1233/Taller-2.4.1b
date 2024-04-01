// Clase CuerpoHumano (TODO)
public class CuerpoHumano {
    // Clase Corazon (Componente)
    public class Corazon {
        private int ritmoCardiaco;
        private String tipo;

        // Getters y setters
        public int getRitmoCardiaco() {
            return ritmoCardiaco;
        }

        public void setRitmoCardiaco(int ritmoCardiaco) {
            this.ritmoCardiaco = ritmoCardiaco;
        }

        public String getTipo() {
            return tipo;
        }

        public void setTipo(String tipo) {
            this.tipo = tipo;
        }
    }

    // Clase Pulmon (Componente)
    public class Pulmon {
        private int capacidadRespiratoria;
        private String estado;

        // Getters y setters
        public int getCapacidadRespiratoria() {
            return capacidadRespiratoria;
        }

        public void setCapacidadRespiratoria(int capacidadRespiratoria) {
            this.capacidadRespiratoria = capacidadRespiratoria;
        }

        public String getEstado() {
            return estado;
        }

        public void setEstado(String estado) {
            this.estado = estado;
        }
    }

    // Clase Higado (Componente)
    public class Higado {
        private int nivelToxicidad;
        private int tamaño;

        // Getters y setters
        public int getNivelToxicidad() {
            return nivelToxicidad;
        }

        public void setNivelToxicidad(int nivelToxicidad) {
            this.nivelToxicidad = nivelToxicidad;
        }

        public int getTamaño() {
            return tamaño;
        }

        public void setTamaño(int tamaño) {
            this.tamaño = tamaño;
        }
    }

    // Clase Apendice (Componente)
    public class Apendice {
        private boolean inflamado;
        private boolean sano;

        // Getters y setters
        public boolean isInflamado() {
            return inflamado;
        }

        public void setInflamado(boolean inflamado) {
            this.inflamado = inflamado;
        }

        public boolean isSano() {
            return sano;
        }

        public void setSano(boolean sano) {
            this.sano = sano;
        }
    }

    // Métodos de la clase CuerpoHumano
    public void realizarDigestion() {
        System.out.println("Realizando digestión...");
    }

    public void bombearSangre() {
        System.out.println("Bombear sangre...");
    }

}

// Clase Principal para la Prueba
public class Main {
    public static void main(String[] args) {
        CuerpoHumano cuerpo = new CuerpoHumano();
        
        CuerpoHumano.Corazon corazon = cuerpo.new Corazon();
        corazon.setRitmoCardiaco(70);
        corazon.setTipo("Normal");

        CuerpoHumano.Pulmon pulmon = cuerpo.new Pulmon();
        pulmon.setCapacidadRespiratoria(5000);
        pulmon.setEstado("Sano");

        CuerpoHumano.Higado higado = cuerpo.new Higado();
        higado.setNivelToxicidad(20);
        higado.setTamaño(15);

        CuerpoHumano.Apendice apendice = cuerpo.new Apendice();
        apendice.setInflamado(false);
        apendice.setSano(true);

        System.out.println("Ritmo cardíaco: " + corazon.getRitmoCardiaco());
        System.out.println("Capacidad respiratoria: " + pulmon.getCapacidadRespiratoria());
        System.out.println("Nivel de toxicidad del hígado: " + higado.getNivelToxicidad());
        System.out.println("Estado del apéndice: " + (apendice.isSano() ? "Sano" : "Inflamado"));

        cuerpo.realizarDigestion();
        cuerpo.bombearSangre();
    }
}
