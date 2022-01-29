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