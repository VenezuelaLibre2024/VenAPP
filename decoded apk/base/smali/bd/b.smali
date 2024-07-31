.class public Lbd/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final c:Lyc/j;

.field private static final d:Ljava/lang/String;

.field private static final e:Ljava/lang/String;

.field private static final f:Lf6/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lf6/e<",
            "Lxc/f0;",
            "[B>;"
        }
    .end annotation
.end field


# instance fields
.field private final a:Lbd/e;

.field private final b:Lf6/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lf6/e<",
            "Lxc/f0;",
            "[B>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lyc/j;

    invoke-direct {v0}, Lyc/j;-><init>()V

    sput-object v0, Lbd/b;->c:Lyc/j;

    const-string v0, "hts/cahyiseot-agolai.o/1frlglgc/aclg"

    const-string v1, "tp:/rsltcrprsp.ogepscmv/ieo/eaybtho"

    invoke-static {v0, v1}, Lbd/b;->e(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lbd/b;->d:Ljava/lang/String;

    const-string v0, "AzSBpY4F0rHiHFdinTvM"

    const-string v1, "IayrSTFL9eJ69YeSUO2"

    invoke-static {v0, v1}, Lbd/b;->e(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lbd/b;->e:Ljava/lang/String;

    new-instance v0, Lbd/a;

    invoke-direct {v0}, Lbd/a;-><init>()V

    sput-object v0, Lbd/b;->f:Lf6/e;

    return-void
.end method

.method constructor <init>(Lbd/e;Lf6/e;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbd/e;",
            "Lf6/e<",
            "Lxc/f0;",
            "[B>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbd/b;->a:Lbd/e;

    iput-object p2, p0, Lbd/b;->b:Lf6/e;

    return-void
.end method

.method public static synthetic a(Lxc/f0;)[B
    .locals 0

    invoke-static {p0}, Lbd/b;->d(Lxc/f0;)[B

    move-result-object p0

    return-object p0
.end method

.method public static b(Landroid/content/Context;Lcd/i;Lvc/g0;)Lbd/b;
    .locals 4

    invoke-static {p0}, Lh6/u;->f(Landroid/content/Context;)V

    invoke-static {}, Lh6/u;->c()Lh6/u;

    move-result-object p0

    new-instance v0, Lcom/google/android/datatransport/cct/a;

    sget-object v1, Lbd/b;->d:Ljava/lang/String;

    sget-object v2, Lbd/b;->e:Ljava/lang/String;

    invoke-direct {v0, v1, v2}, Lcom/google/android/datatransport/cct/a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lh6/u;->g(Lh6/f;)Lf6/g;

    move-result-object p0

    const-string v0, "json"

    invoke-static {v0}, Lf6/b;->b(Ljava/lang/String;)Lf6/b;

    move-result-object v0

    sget-object v1, Lbd/b;->f:Lf6/e;

    const-string v2, "FIREBASE_CRASHLYTICS_REPORT"

    const-class v3, Lxc/f0;

    invoke-interface {p0, v2, v3, v0, v1}, Lf6/g;->b(Ljava/lang/String;Ljava/lang/Class;Lf6/b;Lf6/e;)Lf6/f;

    move-result-object p0

    new-instance v0, Lbd/e;

    invoke-interface {p1}, Lcd/i;->b()Lcd/d;

    move-result-object p1

    invoke-direct {v0, p0, p1, p2}, Lbd/e;-><init>(Lf6/f;Lcd/d;Lvc/g0;)V

    new-instance p0, Lbd/b;

    invoke-direct {p0, v0, v1}, Lbd/b;-><init>(Lbd/e;Lf6/e;)V

    return-object p0
.end method

.method private static synthetic d(Lxc/f0;)[B
    .locals 1

    sget-object v0, Lbd/b;->c:Lyc/j;

    invoke-virtual {v0, p0}, Lyc/j;->M(Lxc/f0;)Ljava/lang/String;

    move-result-object p0

    const-string v0, "UTF-8"

    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p0

    return-object p0
.end method

.method private static e(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    sub-int/2addr v0, v1

    if-ltz v0, :cond_2

    const/4 v1, 0x1

    if-gt v0, v1, :cond_2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    add-int/2addr v1, v2

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const/4 v1, 0x0

    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v2

    if-ge v1, v2, :cond_1

    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    if-le v2, v1, :cond_0

    invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C

    move-result v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Invalid input received"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public c(Lvc/u;Z)Lcom/google/android/gms/tasks/Task;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvc/u;",
            "Z)",
            "Lcom/google/android/gms/tasks/Task<",
            "Lvc/u;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lbd/b;->a:Lbd/e;

    invoke-virtual {v0, p1, p2}, Lbd/e;->i(Lvc/u;Z)Lcom/google/android/gms/tasks/TaskCompletionSource;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->getTask()Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method
