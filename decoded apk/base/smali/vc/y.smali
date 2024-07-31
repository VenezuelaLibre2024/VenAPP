.class public final enum Lvc/y;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lvc/y;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lvc/y;

.field public static final enum APP_STORE:Lvc/y;

.field public static final enum DEVELOPER:Lvc/y;

.field public static final enum TEST_DISTRIBUTION:Lvc/y;

.field public static final enum USER_SIDELOAD:Lvc/y;


# instance fields
.field private final id:I


# direct methods
.method static constructor <clinit>()V
    .locals 10

    new-instance v0, Lvc/y;

    const-string v1, "DEVELOPER"

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lvc/y;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lvc/y;->DEVELOPER:Lvc/y;

    new-instance v1, Lvc/y;

    const-string v4, "USER_SIDELOAD"

    const/4 v5, 0x2

    invoke-direct {v1, v4, v3, v5}, Lvc/y;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lvc/y;->USER_SIDELOAD:Lvc/y;

    new-instance v4, Lvc/y;

    const-string v6, "TEST_DISTRIBUTION"

    const/4 v7, 0x3

    invoke-direct {v4, v6, v5, v7}, Lvc/y;-><init>(Ljava/lang/String;II)V

    sput-object v4, Lvc/y;->TEST_DISTRIBUTION:Lvc/y;

    new-instance v6, Lvc/y;

    const-string v8, "APP_STORE"

    const/4 v9, 0x4

    invoke-direct {v6, v8, v7, v9}, Lvc/y;-><init>(Ljava/lang/String;II)V

    sput-object v6, Lvc/y;->APP_STORE:Lvc/y;

    new-array v8, v9, [Lvc/y;

    aput-object v0, v8, v2

    aput-object v1, v8, v3

    aput-object v4, v8, v5

    aput-object v6, v8, v7

    sput-object v8, Lvc/y;->$VALUES:[Lvc/y;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lvc/y;->id:I

    return-void
.end method

.method public static b(Ljava/lang/String;)Lvc/y;
    .locals 0

    if-eqz p0, :cond_0

    sget-object p0, Lvc/y;->APP_STORE:Lvc/y;

    goto :goto_0

    :cond_0
    sget-object p0, Lvc/y;->DEVELOPER:Lvc/y;

    :goto_0
    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lvc/y;
    .locals 1

    const-class v0, Lvc/y;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lvc/y;

    return-object p0
.end method

.method public static values()[Lvc/y;
    .locals 1

    sget-object v0, Lvc/y;->$VALUES:[Lvc/y;

    invoke-virtual {v0}, [Lvc/y;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lvc/y;

    return-object v0
.end method


# virtual methods
.method public h()I
    .locals 1

    iget v0, p0, Lvc/y;->id:I

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    iget v0, p0, Lvc/y;->id:I

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
