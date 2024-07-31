.class public final enum Lcom/facebook/internal/i0;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/internal/i0$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/facebook/internal/i0;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/facebook/internal/i0;

.field private static final ALL:Ljava/util/EnumSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/EnumSet<",
            "Lcom/facebook/internal/i0;",
            ">;"
        }
    .end annotation
.end field

.field public static final Companion:Lcom/facebook/internal/i0$a;

.field public static final enum Enabled:Lcom/facebook/internal/i0;

.field public static final enum None:Lcom/facebook/internal/i0;

.field public static final enum RequireConfirm:Lcom/facebook/internal/i0;


# instance fields
.field private final value:J


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lcom/facebook/internal/i0;

    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    const-string v4, "None"

    invoke-direct {v0, v4, v1, v2, v3}, Lcom/facebook/internal/i0;-><init>(Ljava/lang/String;IJ)V

    sput-object v0, Lcom/facebook/internal/i0;->None:Lcom/facebook/internal/i0;

    new-instance v0, Lcom/facebook/internal/i0;

    const/4 v1, 0x1

    const-wide/16 v2, 0x1

    const-string v4, "Enabled"

    invoke-direct {v0, v4, v1, v2, v3}, Lcom/facebook/internal/i0;-><init>(Ljava/lang/String;IJ)V

    sput-object v0, Lcom/facebook/internal/i0;->Enabled:Lcom/facebook/internal/i0;

    new-instance v0, Lcom/facebook/internal/i0;

    const/4 v1, 0x2

    const-wide/16 v2, 0x2

    const-string v4, "RequireConfirm"

    invoke-direct {v0, v4, v1, v2, v3}, Lcom/facebook/internal/i0;-><init>(Ljava/lang/String;IJ)V

    sput-object v0, Lcom/facebook/internal/i0;->RequireConfirm:Lcom/facebook/internal/i0;

    invoke-static {}, Lcom/facebook/internal/i0;->b()[Lcom/facebook/internal/i0;

    move-result-object v0

    sput-object v0, Lcom/facebook/internal/i0;->$VALUES:[Lcom/facebook/internal/i0;

    new-instance v0, Lcom/facebook/internal/i0$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/facebook/internal/i0$a;-><init>(Lkotlin/jvm/internal/g;)V

    sput-object v0, Lcom/facebook/internal/i0;->Companion:Lcom/facebook/internal/i0$a;

    const-class v0, Lcom/facebook/internal/i0;

    invoke-static {v0}, Ljava/util/EnumSet;->allOf(Ljava/lang/Class;)Ljava/util/EnumSet;

    move-result-object v0

    const-string v1, "allOf(SmartLoginOption::class.java)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v0, Lcom/facebook/internal/i0;->ALL:Ljava/util/EnumSet;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;IJ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-wide p3, p0, Lcom/facebook/internal/i0;->value:J

    return-void
.end method

.method private static final synthetic b()[Lcom/facebook/internal/i0;
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [Lcom/facebook/internal/i0;

    const/4 v1, 0x0

    sget-object v2, Lcom/facebook/internal/i0;->None:Lcom/facebook/internal/i0;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lcom/facebook/internal/i0;->Enabled:Lcom/facebook/internal/i0;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lcom/facebook/internal/i0;->RequireConfirm:Lcom/facebook/internal/i0;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static final synthetic h()Ljava/util/EnumSet;
    .locals 1

    sget-object v0, Lcom/facebook/internal/i0;->ALL:Ljava/util/EnumSet;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/internal/i0;
    .locals 1

    const-string v0, "value"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v0, Lcom/facebook/internal/i0;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/facebook/internal/i0;

    return-object p0
.end method

.method public static values()[Lcom/facebook/internal/i0;
    .locals 2

    sget-object v0, Lcom/facebook/internal/i0;->$VALUES:[Lcom/facebook/internal/i0;

    array-length v1, v0

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/internal/i0;

    return-object v0
.end method


# virtual methods
.method public final i()J
    .locals 2

    iget-wide v0, p0, Lcom/facebook/internal/i0;->value:J

    return-wide v0
.end method
