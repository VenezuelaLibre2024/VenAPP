.class public final enum Lf2/s$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lf2/s;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lf2/s$a;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lf2/s$a;

.field public static final enum BLOCKED:Lf2/s$a;

.field public static final enum CANCELLED:Lf2/s$a;

.field public static final enum ENQUEUED:Lf2/s$a;

.field public static final enum FAILED:Lf2/s$a;

.field public static final enum RUNNING:Lf2/s$a;

.field public static final enum SUCCEEDED:Lf2/s$a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lf2/s$a;

    const-string v1, "ENQUEUED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lf2/s$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lf2/s$a;->ENQUEUED:Lf2/s$a;

    new-instance v0, Lf2/s$a;

    const-string v1, "RUNNING"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lf2/s$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lf2/s$a;->RUNNING:Lf2/s$a;

    new-instance v0, Lf2/s$a;

    const-string v1, "SUCCEEDED"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lf2/s$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lf2/s$a;->SUCCEEDED:Lf2/s$a;

    new-instance v0, Lf2/s$a;

    const-string v1, "FAILED"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lf2/s$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lf2/s$a;->FAILED:Lf2/s$a;

    new-instance v0, Lf2/s$a;

    const-string v1, "BLOCKED"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lf2/s$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lf2/s$a;->BLOCKED:Lf2/s$a;

    new-instance v0, Lf2/s$a;

    const-string v1, "CANCELLED"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lf2/s$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lf2/s$a;->CANCELLED:Lf2/s$a;

    invoke-static {}, Lf2/s$a;->b()[Lf2/s$a;

    move-result-object v0

    sput-object v0, Lf2/s$a;->$VALUES:[Lf2/s$a;

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

.method private static synthetic b()[Lf2/s$a;
    .locals 3

    const/4 v0, 0x6

    new-array v0, v0, [Lf2/s$a;

    const/4 v1, 0x0

    sget-object v2, Lf2/s$a;->ENQUEUED:Lf2/s$a;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lf2/s$a;->RUNNING:Lf2/s$a;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lf2/s$a;->SUCCEEDED:Lf2/s$a;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Lf2/s$a;->FAILED:Lf2/s$a;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    sget-object v2, Lf2/s$a;->BLOCKED:Lf2/s$a;

    aput-object v2, v0, v1

    const/4 v1, 0x5

    sget-object v2, Lf2/s$a;->CANCELLED:Lf2/s$a;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lf2/s$a;
    .locals 1

    const-class v0, Lf2/s$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lf2/s$a;

    return-object p0
.end method

.method public static values()[Lf2/s$a;
    .locals 1

    sget-object v0, Lf2/s$a;->$VALUES:[Lf2/s$a;

    invoke-virtual {v0}, [Lf2/s$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lf2/s$a;

    return-object v0
.end method


# virtual methods
.method public h()Z
    .locals 1

    sget-object v0, Lf2/s$a;->SUCCEEDED:Lf2/s$a;

    if-eq p0, v0, :cond_1

    sget-object v0, Lf2/s$a;->FAILED:Lf2/s$a;

    if-eq p0, v0, :cond_1

    sget-object v0, Lf2/s$a;->CANCELLED:Lf2/s$a;

    if-ne p0, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method
