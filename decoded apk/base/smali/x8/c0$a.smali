.class public final Lx8/c0$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx8/c0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private a:Z

.field private b:Z

.field private c:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lx8/c0$a;->a:Z

    const/4 v0, 0x0

    iput-boolean v0, p0, Lx8/c0$a;->b:Z

    iput-boolean v0, p0, Lx8/c0$a;->c:Z

    return-void
.end method

.method static bridge synthetic e(Lx8/c0$a;)Z
    .locals 0

    iget-boolean p0, p0, Lx8/c0$a;->c:Z

    return p0
.end method

.method static bridge synthetic f(Lx8/c0$a;)Z
    .locals 0

    iget-boolean p0, p0, Lx8/c0$a;->b:Z

    return p0
.end method

.method static bridge synthetic g(Lx8/c0$a;)Z
    .locals 0

    iget-boolean p0, p0, Lx8/c0$a;->a:Z

    return p0
.end method


# virtual methods
.method public a()Lx8/c0;
    .locals 2

    new-instance v0, Lx8/c0;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lx8/c0;-><init>(Lx8/c0$a;Lx8/l0;)V

    return-object v0
.end method

.method public b(Z)Lx8/c0$a;
    .locals 0

    iput-boolean p1, p0, Lx8/c0$a;->c:Z

    return-object p0
.end method

.method public c(Z)Lx8/c0$a;
    .locals 0

    iput-boolean p1, p0, Lx8/c0$a;->b:Z

    return-object p0
.end method

.method public d(Z)Lx8/c0$a;
    .locals 0

    iput-boolean p1, p0, Lx8/c0$a;->a:Z

    return-object p0
.end method
