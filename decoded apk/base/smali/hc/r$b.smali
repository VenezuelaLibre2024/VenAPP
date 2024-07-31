.class final enum Lhc/r$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lhc/r;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4018
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lhc/r$b;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lhc/r$b;

.field public static final enum DEFAULT_APP_CHECK_TOKEN:Lhc/r$b;

.field public static final enum UNKNOWN_APP_CHECK_TOKEN:Lhc/r$b;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lhc/r$b;

    const-string v1, "DEFAULT_APP_CHECK_TOKEN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lhc/r$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lhc/r$b;->DEFAULT_APP_CHECK_TOKEN:Lhc/r$b;

    new-instance v1, Lhc/r$b;

    const-string v3, "UNKNOWN_APP_CHECK_TOKEN"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lhc/r$b;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lhc/r$b;->UNKNOWN_APP_CHECK_TOKEN:Lhc/r$b;

    const/4 v3, 0x2

    new-array v3, v3, [Lhc/r$b;

    aput-object v0, v3, v2

    aput-object v1, v3, v4

    sput-object v3, Lhc/r$b;->$VALUES:[Lhc/r$b;

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

.method public static valueOf(Ljava/lang/String;)Lhc/r$b;
    .locals 1

    const-class v0, Lhc/r$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lhc/r$b;

    return-object p0
.end method

.method public static values()[Lhc/r$b;
    .locals 1

    sget-object v0, Lhc/r$b;->$VALUES:[Lhc/r$b;

    invoke-virtual {v0}, [Lhc/r$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lhc/r$b;

    return-object v0
.end method
