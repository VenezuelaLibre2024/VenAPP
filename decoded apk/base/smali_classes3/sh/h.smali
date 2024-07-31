.class public final enum Lsh/h;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lsh/h;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lik/a;

.field private static final synthetic $VALUES:[Lsh/h;

.field public static final enum High:Lsh/h;

.field public static final enum Low:Lsh/h;

.field public static final enum Medium:Lsh/h;


# instance fields
.field private final value:J


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lsh/h;

    const/4 v1, 0x0

    const-wide/16 v2, 0x32

    const-string v4, "High"

    invoke-direct {v0, v4, v1, v2, v3}, Lsh/h;-><init>(Ljava/lang/String;IJ)V

    sput-object v0, Lsh/h;->High:Lsh/h;

    new-instance v0, Lsh/h;

    const/4 v1, 0x1

    const-wide/16 v2, 0x64

    const-string v4, "Medium"

    invoke-direct {v0, v4, v1, v2, v3}, Lsh/h;-><init>(Ljava/lang/String;IJ)V

    sput-object v0, Lsh/h;->Medium:Lsh/h;

    new-instance v0, Lsh/h;

    const/4 v1, 0x2

    const-wide/16 v2, 0xc8

    const-string v4, "Low"

    invoke-direct {v0, v4, v1, v2, v3}, Lsh/h;-><init>(Ljava/lang/String;IJ)V

    sput-object v0, Lsh/h;->Low:Lsh/h;

    invoke-static {}, Lsh/h;->b()[Lsh/h;

    move-result-object v0

    sput-object v0, Lsh/h;->$VALUES:[Lsh/h;

    invoke-static {v0}, Lik/b;->a([Ljava/lang/Enum;)Lik/a;

    move-result-object v0

    sput-object v0, Lsh/h;->$ENTRIES:Lik/a;

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

    iput-wide p3, p0, Lsh/h;->value:J

    return-void
.end method

.method private static final synthetic b()[Lsh/h;
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [Lsh/h;

    const/4 v1, 0x0

    sget-object v2, Lsh/h;->High:Lsh/h;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lsh/h;->Medium:Lsh/h;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lsh/h;->Low:Lsh/h;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lsh/h;
    .locals 1

    const-class v0, Lsh/h;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lsh/h;

    return-object p0
.end method

.method public static values()[Lsh/h;
    .locals 1

    sget-object v0, Lsh/h;->$VALUES:[Lsh/h;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lsh/h;

    return-object v0
.end method


# virtual methods
.method public final h()J
    .locals 2

    iget-wide v0, p0, Lsh/h;->value:J

    return-wide v0
.end method
