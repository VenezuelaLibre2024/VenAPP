.class final enum Lz/g$c;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lz/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4018
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lz/g$c;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lz/g$c;

.field public static final enum IDLE:Lz/g$c;

.field public static final enum QUEUED:Lz/g$c;

.field public static final enum QUEUING:Lz/g$c;

.field public static final enum RUNNING:Lz/g$c;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lz/g$c;

    const-string v1, "IDLE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lz/g$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lz/g$c;->IDLE:Lz/g$c;

    new-instance v0, Lz/g$c;

    const-string v1, "QUEUING"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lz/g$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lz/g$c;->QUEUING:Lz/g$c;

    new-instance v0, Lz/g$c;

    const-string v1, "QUEUED"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lz/g$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lz/g$c;->QUEUED:Lz/g$c;

    new-instance v0, Lz/g$c;

    const-string v1, "RUNNING"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lz/g$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lz/g$c;->RUNNING:Lz/g$c;

    invoke-static {}, Lz/g$c;->b()[Lz/g$c;

    move-result-object v0

    sput-object v0, Lz/g$c;->$VALUES:[Lz/g$c;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method private static synthetic b()[Lz/g$c;
    .locals 3

    const/4 v0, 0x4

    new-array v0, v0, [Lz/g$c;

    const/4 v1, 0x0

    sget-object v2, Lz/g$c;->IDLE:Lz/g$c;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lz/g$c;->QUEUING:Lz/g$c;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lz/g$c;->QUEUED:Lz/g$c;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Lz/g$c;->RUNNING:Lz/g$c;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lz/g$c;
    .locals 1

    const-class v0, Lz/g$c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lz/g$c;

    return-object p0
.end method

.method public static values()[Lz/g$c;
    .locals 1

    sget-object v0, Lz/g$c;->$VALUES:[Lz/g$c;

    invoke-virtual {v0}, [Lz/g$c;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lz/g$c;

    return-object v0
.end method
