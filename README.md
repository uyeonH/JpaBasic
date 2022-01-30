# JPA 

### 영속성 컨텍스트
```java
    @Enumerated(EnumType.STRING) // enum 이름을 db에 저장, EnumType.ORDINAL이면 순서를 db에 저장
    private RoleType roleType;
    @Temporal(TemporalType.TIMESTAMP) // 날짜 타입 매핑
    private LocalDate createdDate;
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDate  lastModifiedDate;
    @Lob // 대용량 데이터 저장
    private String description;
    @Transient // DB에 생성하지 않는 메모리에서만 사용하는 용도
    private int temp;

```

Member와 Team 중 연관관계의 주인은 Member의 team이다.
mappedBy가 있는 Team은 주인이 아니다.
양방향 관계에서 Team의 값이 변경 될 경우 Member에 있는 Team을 변경해주면 된다.

양방향 매핑 시 연관관계의 주인에 값을 입력해야 한다.
순수한 객체 관계를 고려하면 양쪽 다 값을 입력해야 한다.

연관관계 편의 메소드를 생성하자. 둘 중 하나의 객체에 설정한다. 양방향 매핑시 무한루프를 조심.

연관관계를 맺고 toString을 하면 서로 무한 참조하게 된다. (오류)
toString() 사용 지양하기.
JSON 생성 라이브러리 사용 지양하기.
-> Controller에서 entity 자체를 반환하지 않기
-> entity가 변경되면 api 스펙이 바뀌게 된다.

연관관계의 주인을 정할 때에는 비즈니스 로직 기준이 아닌 외래 키의 위치를 기준으로 정해야 한다.

일대다 단방향 매핑보다는 다대일 양방향 매핑을 사용하자.

