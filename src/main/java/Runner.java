class Runner {
    public static void main(String[] args){
        Planet planet = new Planet("Alderaan", 908973);
        String output = String.format("%s is %d", planet.getName(), planet.getSize());
        System.out.println(output);
        System.out.println(planet.explode());
    }
}
