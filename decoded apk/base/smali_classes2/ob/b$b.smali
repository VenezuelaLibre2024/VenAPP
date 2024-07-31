.class public abstract enum Lob/b$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lob/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4409
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lob/b$b;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lob/b$b;

.field public static final enum ALGORITHM_NOT_FIPS:Lob/b$b;

.field public static final enum ALGORITHM_REQUIRES_BORINGCRYPTO:Lob/b$b;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lob/b$b$a;

    const-string v1, "ALGORITHM_NOT_FIPS"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lob/b$b$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lob/b$b;->ALGORITHM_NOT_FIPS:Lob/b$b;

    new-instance v1, Lob/b$b$b;

    const-string v3, "ALGORITHM_REQUIRES_BORINGCRYPTO"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lob/b$b$b;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lob/b$b;->ALGORITHM_REQUIRES_BORINGCRYPTO:Lob/b$b;

    const/4 v3, 0x2

    new-array v3, v3, [Lob/b$b;

    aput-object v0, v3, v2

    aput-object v1, v3, v4

    sput-object v3, Lob/b$b;->$VALUES:[Lob/b$b;

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

.method synthetic constructor <init>(Ljava/lang/String;ILob/b$a;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lob/b$b;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lob/b$b;
    .locals 1

    const-class v0, Lob/b$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lob/b$b;

    return-object p0
.end method

.method public static values()[Lob/b$b;
    .locals 1

    sget-object v0, Lob/b$b;->$VALUES:[Lob/b$b;

    invoke-virtual {v0}, [Lob/b$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lob/b$b;

    return-object v0
.end method


# virtual methods
.method public abstract b()Z
.end method
