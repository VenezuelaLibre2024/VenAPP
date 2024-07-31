.class public final Lt6/d3;
.super Lt6/p3;
.source "SourceFile"


# static fields
.field private static final d:Ljava/lang/String;

.field public static final e:Lt6/o$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lt6/o$a<",
            "Lt6/d3;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final c:F


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x1

    invoke-static {v0}, Lt8/r0;->r0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lt6/d3;->d:Ljava/lang/String;

    new-instance v0, Lt6/c3;

    invoke-direct {v0}, Lt6/c3;-><init>()V

    sput-object v0, Lt6/d3;->e:Lt6/o$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lt6/p3;-><init>()V

    const/high16 v0, -0x40800000    # -1.0f

    iput v0, p0, Lt6/d3;->c:F

    return-void
.end method

.method public constructor <init>(F)V
    .locals 2

    invoke-direct {p0}, Lt6/p3;-><init>()V

    const/4 v0, 0x0

    cmpl-float v0, p1, v0

    if-ltz v0, :cond_0

    const/high16 v0, 0x42c80000    # 100.0f

    cmpg-float v0, p1, v0

    if-gtz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v1, "percent must be in the range of [0, 100]"

    invoke-static {v0, v1}, Lt8/a;->b(ZLjava/lang/Object;)V

    iput p1, p0, Lt6/d3;->c:F

    return-void
.end method

.method public static synthetic d(Landroid/os/Bundle;)Lt6/d3;
    .locals 0

    invoke-static {p0}, Lt6/d3;->e(Landroid/os/Bundle;)Lt6/d3;

    move-result-object p0

    return-object p0
.end method

.method private static e(Landroid/os/Bundle;)Lt6/d3;
    .locals 2

    sget-object v0, Lt6/p3;->a:Ljava/lang/String;

    const/4 v1, -0x1

    invoke-virtual {p0, v0, v1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-static {v1}, Lt8/a;->a(Z)V

    sget-object v0, Lt6/d3;->d:Ljava/lang/String;

    const/high16 v1, -0x40800000    # -1.0f

    invoke-virtual {p0, v0, v1}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;F)F

    move-result p0

    cmpl-float v0, p0, v1

    if-nez v0, :cond_1

    new-instance p0, Lt6/d3;

    invoke-direct {p0}, Lt6/d3;-><init>()V

    goto :goto_1

    :cond_1
    new-instance v0, Lt6/d3;

    invoke-direct {v0, p0}, Lt6/d3;-><init>(F)V

    move-object p0, v0

    :goto_1
    return-object p0
.end method


# virtual methods
.method public a()Landroid/os/Bundle;
    .locals 3

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    sget-object v1, Lt6/p3;->a:Ljava/lang/String;

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    sget-object v1, Lt6/d3;->d:Ljava/lang/String;

    iget v2, p0, Lt6/d3;->c:F

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2

    instance-of v0, p1, Lt6/d3;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    iget v0, p0, Lt6/d3;->c:F

    check-cast p1, Lt6/d3;

    iget p1, p1, Lt6/d3;->c:F

    cmpl-float p1, v0, p1

    if-nez p1, :cond_1

    const/4 v1, 0x1

    :cond_1
    return v1
.end method

.method public hashCode()I
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    iget v1, p0, Lt6/d3;->c:F

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-static {v0}, Leb/k;->b([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method
