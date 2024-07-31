.class public final enum Lyk/d;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lyk/d;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lik/a;

.field private static final synthetic $VALUES:[Lyk/d;

.field public static final enum DAYS:Lyk/d;

.field public static final enum HOURS:Lyk/d;

.field public static final enum MICROSECONDS:Lyk/d;

.field public static final enum MILLISECONDS:Lyk/d;

.field public static final enum MINUTES:Lyk/d;

.field public static final enum NANOSECONDS:Lyk/d;

.field public static final enum SECONDS:Lyk/d;


# instance fields
.field private final timeUnit:Ljava/util/concurrent/TimeUnit;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lyk/d;

    const/4 v1, 0x0

    sget-object v2, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    const-string v3, "NANOSECONDS"

    invoke-direct {v0, v3, v1, v2}, Lyk/d;-><init>(Ljava/lang/String;ILjava/util/concurrent/TimeUnit;)V

    sput-object v0, Lyk/d;->NANOSECONDS:Lyk/d;

    new-instance v0, Lyk/d;

    const/4 v1, 0x1

    sget-object v2, Ljava/util/concurrent/TimeUnit;->MICROSECONDS:Ljava/util/concurrent/TimeUnit;

    const-string v3, "MICROSECONDS"

    invoke-direct {v0, v3, v1, v2}, Lyk/d;-><init>(Ljava/lang/String;ILjava/util/concurrent/TimeUnit;)V

    sput-object v0, Lyk/d;->MICROSECONDS:Lyk/d;

    new-instance v0, Lyk/d;

    const/4 v1, 0x2

    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    const-string v3, "MILLISECONDS"

    invoke-direct {v0, v3, v1, v2}, Lyk/d;-><init>(Ljava/lang/String;ILjava/util/concurrent/TimeUnit;)V

    sput-object v0, Lyk/d;->MILLISECONDS:Lyk/d;

    new-instance v0, Lyk/d;

    const/4 v1, 0x3

    sget-object v2, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-string v3, "SECONDS"

    invoke-direct {v0, v3, v1, v2}, Lyk/d;-><init>(Ljava/lang/String;ILjava/util/concurrent/TimeUnit;)V

    sput-object v0, Lyk/d;->SECONDS:Lyk/d;

    new-instance v0, Lyk/d;

    const/4 v1, 0x4

    sget-object v2, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    const-string v3, "MINUTES"

    invoke-direct {v0, v3, v1, v2}, Lyk/d;-><init>(Ljava/lang/String;ILjava/util/concurrent/TimeUnit;)V

    sput-object v0, Lyk/d;->MINUTES:Lyk/d;

    new-instance v0, Lyk/d;

    const/4 v1, 0x5

    sget-object v2, Ljava/util/concurrent/TimeUnit;->HOURS:Ljava/util/concurrent/TimeUnit;

    const-string v3, "HOURS"

    invoke-direct {v0, v3, v1, v2}, Lyk/d;-><init>(Ljava/lang/String;ILjava/util/concurrent/TimeUnit;)V

    sput-object v0, Lyk/d;->HOURS:Lyk/d;

    new-instance v0, Lyk/d;

    const/4 v1, 0x6

    sget-object v2, Ljava/util/concurrent/TimeUnit;->DAYS:Ljava/util/concurrent/TimeUnit;

    const-string v3, "DAYS"

    invoke-direct {v0, v3, v1, v2}, Lyk/d;-><init>(Ljava/lang/String;ILjava/util/concurrent/TimeUnit;)V

    sput-object v0, Lyk/d;->DAYS:Lyk/d;

    invoke-static {}, Lyk/d;->b()[Lyk/d;

    move-result-object v0

    sput-object v0, Lyk/d;->$VALUES:[Lyk/d;

    invoke-static {v0}, Lik/b;->a([Ljava/lang/Enum;)Lik/a;

    move-result-object v0

    sput-object v0, Lyk/d;->$ENTRIES:Lik/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/util/concurrent/TimeUnit;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/TimeUnit;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lyk/d;->timeUnit:Ljava/util/concurrent/TimeUnit;

    return-void
.end method

.method private static final synthetic b()[Lyk/d;
    .locals 3

    const/4 v0, 0x7

    new-array v0, v0, [Lyk/d;

    const/4 v1, 0x0

    sget-object v2, Lyk/d;->NANOSECONDS:Lyk/d;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lyk/d;->MICROSECONDS:Lyk/d;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lyk/d;->MILLISECONDS:Lyk/d;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Lyk/d;->SECONDS:Lyk/d;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    sget-object v2, Lyk/d;->MINUTES:Lyk/d;

    aput-object v2, v0, v1

    const/4 v1, 0x5

    sget-object v2, Lyk/d;->HOURS:Lyk/d;

    aput-object v2, v0, v1

    const/4 v1, 0x6

    sget-object v2, Lyk/d;->DAYS:Lyk/d;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lyk/d;
    .locals 1

    const-class v0, Lyk/d;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lyk/d;

    return-object p0
.end method

.method public static values()[Lyk/d;
    .locals 1

    sget-object v0, Lyk/d;->$VALUES:[Lyk/d;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lyk/d;

    return-object v0
.end method


# virtual methods
.method public final h()Ljava/util/concurrent/TimeUnit;
    .locals 1

    iget-object v0, p0, Lyk/d;->timeUnit:Ljava/util/concurrent/TimeUnit;

    return-object v0
.end method
