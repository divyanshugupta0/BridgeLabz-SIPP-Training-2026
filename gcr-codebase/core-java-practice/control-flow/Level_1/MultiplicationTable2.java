void main(String[] args) {
    int num = Integer.parseInt(args[0]);
    if (num < 6 || num > 9) {
        IO.println("Please enter a number between 6 and 9");
        return;
    }
    for (int i = 1; i <= 10; i++) {
        IO.println(num + " x " + i + " = " + (num * i));
    }
}
