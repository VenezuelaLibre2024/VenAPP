.class public final Lwb/i;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lwb/i$b;,
        Lwb/i$d;,
        Lwb/i$c;,
        Lwb/i$e;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T_WRAPPER::",
        "Lwb/j<",
        "TJcePrimitiveT;>;JcePrimitiveT:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# static fields
.field public static final b:Lwb/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwb/i<",
            "Lwb/j$a;",
            "Ljavax/crypto/Cipher;",
            ">;"
        }
    .end annotation
.end field

.field public static final c:Lwb/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwb/i<",
            "Lwb/j$e;",
            "Ljavax/crypto/Mac;",
            ">;"
        }
    .end annotation
.end field

.field public static final d:Lwb/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwb/i<",
            "Lwb/j$g;",
            "Ljava/security/Signature;",
            ">;"
        }
    .end annotation
.end field

.field public static final e:Lwb/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwb/i<",
            "Lwb/j$f;",
            "Ljava/security/MessageDigest;",
            ">;"
        }
    .end annotation
.end field

.field public static final f:Lwb/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwb/i<",
            "Lwb/j$b;",
            "Ljavax/crypto/KeyAgreement;",
            ">;"
        }
    .end annotation
.end field

.field public static final g:Lwb/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwb/i<",
            "Lwb/j$d;",
            "Ljava/security/KeyPairGenerator;",
            ">;"
        }
    .end annotation
.end field

.field public static final h:Lwb/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwb/i<",
            "Lwb/j$c;",
            "Ljava/security/KeyFactory;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:Lwb/i$e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwb/i$e<",
            "TJcePrimitiveT;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lwb/i;

    new-instance v1, Lwb/j$a;

    invoke-direct {v1}, Lwb/j$a;-><init>()V

    invoke-direct {v0, v1}, Lwb/i;-><init>(Lwb/j;)V

    sput-object v0, Lwb/i;->b:Lwb/i;

    new-instance v0, Lwb/i;

    new-instance v1, Lwb/j$e;

    invoke-direct {v1}, Lwb/j$e;-><init>()V

    invoke-direct {v0, v1}, Lwb/i;-><init>(Lwb/j;)V

    sput-object v0, Lwb/i;->c:Lwb/i;

    new-instance v0, Lwb/i;

    new-instance v1, Lwb/j$g;

    invoke-direct {v1}, Lwb/j$g;-><init>()V

    invoke-direct {v0, v1}, Lwb/i;-><init>(Lwb/j;)V

    sput-object v0, Lwb/i;->d:Lwb/i;

    new-instance v0, Lwb/i;

    new-instance v1, Lwb/j$f;

    invoke-direct {v1}, Lwb/j$f;-><init>()V

    invoke-direct {v0, v1}, Lwb/i;-><init>(Lwb/j;)V

    sput-object v0, Lwb/i;->e:Lwb/i;

    new-instance v0, Lwb/i;

    new-instance v1, Lwb/j$b;

    invoke-direct {v1}, Lwb/j$b;-><init>()V

    invoke-direct {v0, v1}, Lwb/i;-><init>(Lwb/j;)V

    sput-object v0, Lwb/i;->f:Lwb/i;

    new-instance v0, Lwb/i;

    new-instance v1, Lwb/j$d;

    invoke-direct {v1}, Lwb/j$d;-><init>()V

    invoke-direct {v0, v1}, Lwb/i;-><init>(Lwb/j;)V

    sput-object v0, Lwb/i;->g:Lwb/i;

    new-instance v0, Lwb/i;

    new-instance v1, Lwb/j$c;

    invoke-direct {v1}, Lwb/j$c;-><init>()V

    invoke-direct {v0, v1}, Lwb/i;-><init>(Lwb/j;)V

    sput-object v0, Lwb/i;->h:Lwb/i;

    return-void
.end method

.method public constructor <init>(Lwb/j;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT_WRAPPER;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Lob/b;->c()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    new-instance v0, Lwb/i$d;

    invoke-direct {v0, p1, v1}, Lwb/i$d;-><init>(Lwb/j;Lwb/i$a;)V

    :goto_0
    iput-object v0, p0, Lwb/i;->a:Lwb/i$e;

    goto :goto_1

    :cond_0
    invoke-static {}, Lwb/q;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Lwb/i$b;

    invoke-direct {v0, p1, v1}, Lwb/i$b;-><init>(Lwb/j;Lwb/i$a;)V

    goto :goto_0

    :cond_1
    new-instance v0, Lwb/i$c;

    invoke-direct {v0, p1, v1}, Lwb/i$c;-><init>(Lwb/j;Lwb/i$a;)V

    goto :goto_0

    :goto_1
    return-void
.end method

.method public static varargs b([Ljava/lang/String;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Ljava/security/Provider;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    array-length v1, p0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, p0, v2

    invoke-static {v3}, Ljava/security/Security;->getProvider(Ljava/lang/String;)Ljava/security/Provider;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return-object v0
.end method


# virtual methods
.method public a(Ljava/lang/String;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")TJcePrimitiveT;"
        }
    .end annotation

    iget-object v0, p0, Lwb/i;->a:Lwb/i$e;

    invoke-interface {v0, p1}, Lwb/i$e;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
