public class Human {
  public int yearOfBirth;
  public String name;
  public String town;
    String jobTitle;

  public Human(int yearOfBirth, String name, String town, String jobTitle) {
      this.yearOfBirth = yearOfBirth;
      if (yearOfBirth <= 0){
          this.yearOfBirth = Math.abs(yearOfBirth);
      }
      if (name == null || name.isEmpty() || name.isBlank()) {
          this.name = "Информация не указана";
      } else {
          this.name = name;
      }
      if (town == null || town.isEmpty() || town.isBlank()) {
          this.town = "Информация не указана";
      } else {
          this.town = town;
      }
      if (jobTitle == null || jobTitle.isEmpty() || jobTitle.isBlank()) {
          this.jobTitle = "Информация не указана";
      } else {
          this.jobTitle = jobTitle;
      }
  }

    @Override
    public String toString() {
        return "Привет! Меня зовут " + name +
                ". Я из города " + town +
                ". Я родился в " + yearOfBirth +
                " году. Я работаю на должности " + jobTitle +
                ". Будем знакомы!";
    }

}
