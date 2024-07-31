.class public final Lt6/c2$l$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lt6/c2$l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private a:Landroid/net/Uri;

.field private b:Ljava/lang/String;

.field private c:Ljava/lang/String;

.field private d:I

.field private e:I

.field private f:Ljava/lang/String;

.field private g:Ljava/lang/String;


# direct methods
.method private constructor <init>(Lt6/c2$l;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget-object v0, p1, Lt6/c2$l;->a:Landroid/net/Uri;

    iput-object v0, p0, Lt6/c2$l$a;->a:Landroid/net/Uri;

    iget-object v0, p1, Lt6/c2$l;->b:Ljava/lang/String;

    iput-object v0, p0, Lt6/c2$l$a;->b:Ljava/lang/String;

    iget-object v0, p1, Lt6/c2$l;->c:Ljava/lang/String;

    iput-object v0, p0, Lt6/c2$l$a;->c:Ljava/lang/String;

    iget v0, p1, Lt6/c2$l;->d:I

    iput v0, p0, Lt6/c2$l$a;->d:I

    iget v0, p1, Lt6/c2$l;->e:I

    iput v0, p0, Lt6/c2$l$a;->e:I

    iget-object v0, p1, Lt6/c2$l;->f:Ljava/lang/String;

    iput-object v0, p0, Lt6/c2$l$a;->f:Ljava/lang/String;

    iget-object p1, p1, Lt6/c2$l;->g:Ljava/lang/String;

    iput-object p1, p0, Lt6/c2$l$a;->g:Ljava/lang/String;

    return-void
.end method

.method synthetic constructor <init>(Lt6/c2$l;Lt6/c2$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lt6/c2$l$a;-><init>(Lt6/c2$l;)V

    return-void
.end method

.method static synthetic a(Lt6/c2$l$a;)Lt6/c2$k;
    .locals 0

    invoke-direct {p0}, Lt6/c2$l$a;->i()Lt6/c2$k;

    move-result-object p0

    return-object p0
.end method

.method static synthetic b(Lt6/c2$l$a;)Landroid/net/Uri;
    .locals 0

    iget-object p0, p0, Lt6/c2$l$a;->a:Landroid/net/Uri;

    return-object p0
.end method

.method static synthetic c(Lt6/c2$l$a;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lt6/c2$l$a;->b:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic d(Lt6/c2$l$a;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lt6/c2$l$a;->c:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic e(Lt6/c2$l$a;)I
    .locals 0

    iget p0, p0, Lt6/c2$l$a;->d:I

    return p0
.end method

.method static synthetic f(Lt6/c2$l$a;)I
    .locals 0

    iget p0, p0, Lt6/c2$l$a;->e:I

    return p0
.end method

.method static synthetic g(Lt6/c2$l$a;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lt6/c2$l$a;->f:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic h(Lt6/c2$l$a;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lt6/c2$l$a;->g:Ljava/lang/String;

    return-object p0
.end method

.method private i()Lt6/c2$k;
    .locals 2

    new-instance v0, Lt6/c2$k;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lt6/c2$k;-><init>(Lt6/c2$l$a;Lt6/c2$a;)V

    return-object v0
.end method
