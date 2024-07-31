.class public final Lt6/b4;
.super Lt6/p3;
.source "SourceFile"


# static fields
.field private static final e:Ljava/lang/String;

.field private static final f:Ljava/lang/String;

.field public static final r:Lt6/o$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lt6/o$a<",
            "Lt6/b4;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final c:Z

.field private final d:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x1

    invoke-static {v0}, Lt8/r0;->r0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lt6/b4;->e:Ljava/lang/String;

    const/4 v0, 0x2

    invoke-static {v0}, Lt8/r0;->r0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lt6/b4;->f:Ljava/lang/String;

    new-instance v0, Lt6/a4;

    invoke-direct {v0}, Lt6/a4;-><init>()V

    sput-object v0, Lt6/b4;->r:Lt6/o$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lt6/p3;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lt6/b4;->c:Z

    iput-boolean v0, p0, Lt6/b4;->d:Z

    return-void
.end method

.method public constructor <init>(Z)V
    .locals 1

    invoke-direct {p0}, Lt6/p3;-><init>()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lt6/b4;->c:Z

    iput-boolean p1, p0, Lt6/b4;->d:Z

    return-void
.end method

.method public static synthetic d(Landroid/os/Bundle;)Lt6/b4;
    .locals 0

    invoke-static {p0}, Lt6/b4;->e(Landroid/os/Bundle;)Lt6/b4;

    move-result-object p0

    return-object p0
.end method

.method private static e(Landroid/os/Bundle;)Lt6/b4;
    .locals 3

    sget-object v0, Lt6/p3;->a:Ljava/lang/String;

    const/4 v1, -0x1

    invoke-virtual {p0, v0, v1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    const/4 v1, 0x3

    const/4 v2, 0x0

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    invoke-static {v0}, Lt8/a;->a(Z)V

    sget-object v0, Lt6/b4;->e:Ljava/lang/String;

    invoke-virtual {p0, v0, v2}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Lt6/b4;

    sget-object v1, Lt6/b4;->f:Ljava/lang/String;

    invoke-virtual {p0, v1, v2}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result p0

    invoke-direct {v0, p0}, Lt6/b4;-><init>(Z)V

    goto :goto_1

    :cond_1
    new-instance v0, Lt6/b4;

    invoke-direct {v0}, Lt6/b4;-><init>()V

    :goto_1
    return-object v0
.end method


# virtual methods
.method public a()Landroid/os/Bundle;
    .locals 3

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    sget-object v1, Lt6/p3;->a:Ljava/lang/String;

    const/4 v2, 0x3

    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    sget-object v1, Lt6/b4;->e:Ljava/lang/String;

    iget-boolean v2, p0, Lt6/b4;->c:Z

    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    sget-object v1, Lt6/b4;->f:Ljava/lang/String;

    iget-boolean v2, p0, Lt6/b4;->d:Z

    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Lt6/b4;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, Lt6/b4;

    iget-boolean v0, p0, Lt6/b4;->d:Z

    iget-boolean v2, p1, Lt6/b4;->d:Z

    if-ne v0, v2, :cond_1

    iget-boolean v0, p0, Lt6/b4;->c:Z

    iget-boolean p1, p1, Lt6/b4;->c:Z

    if-ne v0, p1, :cond_1

    const/4 v1, 0x1

    :cond_1
    return v1
.end method

.method public hashCode()I
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    iget-boolean v1, p0, Lt6/b4;->c:Z

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    iget-boolean v1, p0, Lt6/b4;->d:Z

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    invoke-static {v0}, Leb/k;->b([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method
