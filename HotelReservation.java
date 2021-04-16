{

    public static void main(String[] args) throws ParseException {
        int weekendCounter =0;
        int weekdayCounter =0;
        int calculateLakewood=0;
        int calculateBridgewood =0;
        int calculateRidgewood=0;

        Hotels lakewoodHotel = new Hotels();
        lakewoodHotel.setHotelName("Lakewood");
        lakewoodHotel.setRegularWeekdayRates(110);
        lakewoodHotel.setRegularWeekendRates(90);

        Hotels bridgewoodHotel = new Hotels();
        bridgewoodHotel.setHotelName("Bridgewood");
        bridgewoodHotel.setRegularWeekdayRates(160);
        bridgewoodHotel.setRegularWeekendRates(60);

        Hotels ridgewoodHotel = new Hotels();
        ridgewoodHotel.setHotelName("Ridgewood");
        ridgewoodHotel.setRegularWeekdayRates(220);
        ridgewoodHotel.setRegularWeekendRates(150);

        System.out.println("Welcome to Hotel Reservation Program ");
        System.out.println("Enter the number of days you want to stay ");
        Scanner inputDays = new Scanner(System.in);
        int numberOfDays = inputDays.nextInt();
        System.out.println("Enter the dates you wish to book a hotel");
        for (int i = 1; i <=numberOfDays ; i++)
        {
            Scanner inputdate = new Scanner(System.in);
            String date = inputdate.next();
            String month = inputdate.next();
            String year = inputdate.next();
            String inputDateStr = String.format("%s/%s/%s", date,month,year);
            Date inputDate = new SimpleDateFormat("dd/MM/yyyy").parse(inputDateStr);
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(inputDate);
            String dayOfWeek = calendar.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.US).toUpperCase();
            System.out.println(dayOfWeek);

            if (dayOfWeek.equals("SATURDAY") || dayOfWeek.equals("SUNDAY"))
            {
                System.out.println(lakewoodHotel.getHotelName());
            }
            else
            {
                System.out.println(bridgewoodHotel.getHotelName());
            }
        }

    }
}