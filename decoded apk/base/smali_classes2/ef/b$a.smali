.class public final enum Lef/b$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lef/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lef/b$a;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lef/b$a;

.field public static final enum CRASHLYTICS:Lef/b$a;

.field public static final enum MATT_SAYS_HI:Lef/b$a;

.field public static final enum PERFORMANCE:Lef/b$a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lef/b$a;

    const-string v1, "CRASHLYTICS"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lef/b$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lef/b$a;->CRASHLYTICS:Lef/b$a;

    new-instance v0, Lef/b$a;

    const-string v1, "PERFORMANCE"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lef/b$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lef/b$a;->PERFORMANCE:Lef/b$a;

    new-instance v0, Lef/b$a;

    const-string v1, "MATT_SAYS_HI"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lef/b$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lef/b$a;->MATT_SAYS_HI:Lef/b$a;

    invoke-static {}, Lef/b$a;->b()[Lef/b$a;

    move-result-object v0

    sput-object v0, Lef/b$a;->$VALUES:[Lef/b$a;

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

.method private static final synthetic b()[Lef/b$a;
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [Lef/b$a;

    const/4 v1, 0x0

    sget-object v2, Lef/b$a;->CRASHLYTICS:Lef/b$a;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lef/b$a;->PERFORMANCE:Lef/b$a;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lef/b$a;->MATT_SAYS_HI:Lef/b$a;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lef/b$a;
    .locals 1

    const-class v0, Lef/b$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lef/b$a;

    return-object p0
.end method

.method public static values()[Lef/b$a;
    .locals 1

    sget-object v0, Lef/b$a;->$VALUES:[Lef/b$a;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lef/b$a;

    return-object v0
.end method
