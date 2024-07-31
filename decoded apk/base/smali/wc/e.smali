.class public Lwc/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lwc/e$b;
    }
.end annotation


# static fields
.field private static final c:Lwc/e$b;


# instance fields
.field private final a:Lad/f;

.field private b:Lwc/c;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lwc/e$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lwc/e$b;-><init>(Lwc/e$a;)V

    sput-object v0, Lwc/e;->c:Lwc/e$b;

    return-void
.end method

.method public constructor <init>(Lad/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwc/e;->a:Lad/f;

    sget-object p1, Lwc/e;->c:Lwc/e$b;

    iput-object p1, p0, Lwc/e;->b:Lwc/c;

    return-void
.end method

.method public constructor <init>(Lad/f;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lwc/e;-><init>(Lad/f;)V

    invoke-virtual {p0, p2}, Lwc/e;->e(Ljava/lang/String;)V

    return-void
.end method

.method private d(Ljava/lang/String;)Ljava/io/File;
    .locals 2

    iget-object v0, p0, Lwc/e;->a:Lad/f;

    const-string v1, "userlog"

    invoke-virtual {v0, p1, v1}, Lad/f;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, Lwc/e;->b:Lwc/c;

    invoke-interface {v0}, Lwc/c;->d()V

    return-void
.end method

.method public b()[B
    .locals 1

    iget-object v0, p0, Lwc/e;->b:Lwc/c;

    invoke-interface {v0}, Lwc/c;->c()[B

    move-result-object v0

    return-object v0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lwc/e;->b:Lwc/c;

    invoke-interface {v0}, Lwc/c;->b()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final e(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lwc/e;->b:Lwc/c;

    invoke-interface {v0}, Lwc/c;->a()V

    sget-object v0, Lwc/e;->c:Lwc/e$b;

    iput-object v0, p0, Lwc/e;->b:Lwc/c;

    if-nez p1, :cond_0

    return-void

    :cond_0
    invoke-direct {p0, p1}, Lwc/e;->d(Ljava/lang/String;)Ljava/io/File;

    move-result-object p1

    const/high16 v0, 0x10000

    invoke-virtual {p0, p1, v0}, Lwc/e;->f(Ljava/io/File;I)V

    return-void
.end method

.method f(Ljava/io/File;I)V
    .locals 1

    new-instance v0, Lwc/h;

    invoke-direct {v0, p1, p2}, Lwc/h;-><init>(Ljava/io/File;I)V

    iput-object v0, p0, Lwc/e;->b:Lwc/c;

    return-void
.end method

.method public g(JLjava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lwc/e;->b:Lwc/c;

    invoke-interface {v0, p1, p2, p3}, Lwc/c;->e(JLjava/lang/String;)V

    return-void
.end method
