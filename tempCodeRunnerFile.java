System.out.println("-----Switch case Example with Array Sorting----------");

            Scanner numbers= new Scanner(System.in);
            System.out.println("Enter the Nuber");


            int num = numbers.nextInt();
            switch(num>5)
            {
                case true:
                    System.out.println("Your array size is 5");
                    break;
                case false:
                    System.out.println("We cannot process your array size");
                    break;
                default:
                    System.out.println("Invalid input");
            }