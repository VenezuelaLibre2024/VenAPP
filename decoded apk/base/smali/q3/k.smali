.class public abstract Lq3/k;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lq3/k$g;,
        Lq3/k$c;,
        Lq3/k$f;,
        Lq3/k$b;,
        Lq3/k$a;,
        Lq3/k$d;,
        Lq3/k$e;
    }
.end annotation


# static fields
.field public static final a:Lq3/k;

.field public static final b:Lq3/k;

.field public static final c:Lq3/k;

.field public static final d:Lq3/k;

.field public static final e:Lq3/k;

.field public static final f:Lq3/k;

.field public static final g:Lq3/k;

.field public static final h:Lh3/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lh3/g<",
            "Lq3/k;",
            ">;"
        }
    .end annotation
.end field

.field static final i:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lq3/k$a;

    invoke-direct {v0}, Lq3/k$a;-><init>()V

    sput-object v0, Lq3/k;->a:Lq3/k;

    new-instance v0, Lq3/k$b;

    invoke-direct {v0}, Lq3/k$b;-><init>()V

    sput-object v0, Lq3/k;->b:Lq3/k;

    new-instance v0, Lq3/k$e;

    invoke-direct {v0}, Lq3/k$e;-><init>()V

    sput-object v0, Lq3/k;->c:Lq3/k;

    new-instance v0, Lq3/k$c;

    invoke-direct {v0}, Lq3/k$c;-><init>()V

    sput-object v0, Lq3/k;->d:Lq3/k;

    new-instance v0, Lq3/k$d;

    invoke-direct {v0}, Lq3/k$d;-><init>()V

    sput-object v0, Lq3/k;->e:Lq3/k;

    new-instance v1, Lq3/k$f;

    invoke-direct {v1}, Lq3/k$f;-><init>()V

    sput-object v1, Lq3/k;->f:Lq3/k;

    sput-object v0, Lq3/k;->g:Lq3/k;

    const-string v1, "com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy"

    invoke-static {v1, v0}, Lh3/g;->f(Ljava/lang/String;Ljava/lang/Object;)Lh3/g;

    move-result-object v0

    sput-object v0, Lq3/k;->h:Lh3/g;

    const/4 v0, 0x1

    sput-boolean v0, Lq3/k;->i:Z

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract a(IIII)Lq3/k$g;
.end method

.method public abstract b(IIII)F
.end method
