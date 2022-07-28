public class Functions {
    // Faça somente 1 coisa
    //A
    public void saveCash(Income income, Expense expense){
        inRepo.save(income);
        outRepo.save(expense);
    }

    //B
    @PostMapping("/user")
    public User saveUser(User user){
        return userService.userRepository.save(user);
    }

    //B
    public void saveUser(String userName, User user, Date date, boolean isAdmin){};

    //B
    public User saveUser(User user){
        return userRepository.save(user);
    }
    public void setRole(User user){
        user.setRole(user);
    }

    //B
    public Environment getEnvironment(){
        return environmentService.getEnvironment(getVersion());
    }
    public Release getRelease(){
        return releaseService.getRelease(getVersion());
    }
    private String getVersion(){
        return versionService.getVersion();
    }

}