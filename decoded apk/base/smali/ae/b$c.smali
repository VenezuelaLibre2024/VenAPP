.class final Lae/b$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lae/a$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lae/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "c"
.end annotation


# instance fields
.field private a:Lzd/b;

.field private b:Lbe/d;

.field private c:Lbe/z;

.field private d:Lae/d;

.field private e:Lf6/g;


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lae/b$a;)V
    .locals 0

    invoke-direct {p0}, Lae/b$c;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Lae/d;)Lae/a$a;
    .locals 0

    invoke-virtual {p0, p1}, Lae/b$c;->j(Lae/d;)Lae/b$c;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic b(Lbe/z;)Lae/a$a;
    .locals 0

    invoke-virtual {p0, p1}, Lae/b$c;->h(Lbe/z;)Lae/b$c;

    move-result-object p1

    return-object p1
.end method

.method public build()Lae/a;
    .locals 9

    iget-object v0, p0, Lae/b$c;->a:Lzd/b;

    const-class v1, Lzd/b;

    invoke-static {v0, v1}, Lrd/d;->a(Ljava/lang/Object;Ljava/lang/Class;)V

    iget-object v0, p0, Lae/b$c;->b:Lbe/d;

    const-class v1, Lbe/d;

    invoke-static {v0, v1}, Lrd/d;->a(Ljava/lang/Object;Ljava/lang/Class;)V

    iget-object v0, p0, Lae/b$c;->c:Lbe/z;

    const-class v1, Lbe/z;

    invoke-static {v0, v1}, Lrd/d;->a(Ljava/lang/Object;Ljava/lang/Class;)V

    iget-object v0, p0, Lae/b$c;->d:Lae/d;

    const-class v1, Lae/d;

    invoke-static {v0, v1}, Lrd/d;->a(Ljava/lang/Object;Ljava/lang/Class;)V

    iget-object v0, p0, Lae/b$c;->e:Lf6/g;

    const-class v1, Lf6/g;

    invoke-static {v0, v1}, Lrd/d;->a(Ljava/lang/Object;Ljava/lang/Class;)V

    new-instance v0, Lae/b$b;

    iget-object v3, p0, Lae/b$c;->b:Lbe/d;

    iget-object v4, p0, Lae/b$c;->c:Lbe/z;

    iget-object v5, p0, Lae/b$c;->d:Lae/d;

    iget-object v6, p0, Lae/b$c;->a:Lzd/b;

    iget-object v7, p0, Lae/b$c;->e:Lf6/g;

    const/4 v8, 0x0

    move-object v2, v0

    invoke-direct/range {v2 .. v8}, Lae/b$b;-><init>(Lbe/d;Lbe/z;Lae/d;Lzd/b;Lf6/g;Lae/b$a;)V

    return-object v0
.end method

.method public bridge synthetic c(Lzd/b;)Lae/a$a;
    .locals 0

    invoke-virtual {p0, p1}, Lae/b$c;->f(Lzd/b;)Lae/b$c;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic d(Lbe/d;)Lae/a$a;
    .locals 0

    invoke-virtual {p0, p1}, Lae/b$c;->g(Lbe/d;)Lae/b$c;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic e(Lf6/g;)Lae/a$a;
    .locals 0

    invoke-virtual {p0, p1}, Lae/b$c;->i(Lf6/g;)Lae/b$c;

    move-result-object p1

    return-object p1
.end method

.method public f(Lzd/b;)Lae/b$c;
    .locals 0

    invoke-static {p1}, Lrd/d;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lzd/b;

    iput-object p1, p0, Lae/b$c;->a:Lzd/b;

    return-object p0
.end method

.method public g(Lbe/d;)Lae/b$c;
    .locals 0

    invoke-static {p1}, Lrd/d;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lbe/d;

    iput-object p1, p0, Lae/b$c;->b:Lbe/d;

    return-object p0
.end method

.method public h(Lbe/z;)Lae/b$c;
    .locals 0

    invoke-static {p1}, Lrd/d;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lbe/z;

    iput-object p1, p0, Lae/b$c;->c:Lbe/z;

    return-object p0
.end method

.method public i(Lf6/g;)Lae/b$c;
    .locals 0

    invoke-static {p1}, Lrd/d;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lf6/g;

    iput-object p1, p0, Lae/b$c;->e:Lf6/g;

    return-object p0
.end method

.method public j(Lae/d;)Lae/b$c;
    .locals 0

    invoke-static {p1}, Lrd/d;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lae/d;

    iput-object p1, p0, Lae/b$c;->d:Lae/d;

    return-object p0
.end method
