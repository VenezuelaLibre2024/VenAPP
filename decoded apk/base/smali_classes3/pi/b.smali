.class public final enum Lpi/b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lpi/b;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lik/a;

.field private static final synthetic $VALUES:[Lpi/b;

.field public static final enum NORMAL:Lpi/b;

.field public static final enum NO_DUPLICATES:Lpi/b;

.field public static final enum UNRESTRICTED:Lpi/b;


# instance fields
.field private final intValue:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lpi/b;

    const-string v1, "NO_DUPLICATES"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lpi/b;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lpi/b;->NO_DUPLICATES:Lpi/b;

    new-instance v0, Lpi/b;

    const-string v1, "NORMAL"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v2}, Lpi/b;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lpi/b;->NORMAL:Lpi/b;

    new-instance v0, Lpi/b;

    const-string v1, "UNRESTRICTED"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2, v2}, Lpi/b;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lpi/b;->UNRESTRICTED:Lpi/b;

    invoke-static {}, Lpi/b;->b()[Lpi/b;

    move-result-object v0

    sput-object v0, Lpi/b;->$VALUES:[Lpi/b;

    invoke-static {v0}, Lik/b;->a([Ljava/lang/Enum;)Lik/a;

    move-result-object v0

    sput-object v0, Lpi/b;->$ENTRIES:Lik/a;

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

    iput p3, p0, Lpi/b;->intValue:I

    return-void
.end method

.method private static final synthetic b()[Lpi/b;
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [Lpi/b;

    const/4 v1, 0x0

    sget-object v2, Lpi/b;->NO_DUPLICATES:Lpi/b;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lpi/b;->NORMAL:Lpi/b;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lpi/b;->UNRESTRICTED:Lpi/b;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lpi/b;
    .locals 1

    const-class v0, Lpi/b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lpi/b;

    return-object p0
.end method

.method public static values()[Lpi/b;
    .locals 1

    sget-object v0, Lpi/b;->$VALUES:[Lpi/b;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lpi/b;

    return-object v0
.end method


# virtual methods
.method public final h()I
    .locals 1

    iget v0, p0, Lpi/b;->intValue:I

    return v0
.end method
