.class public final Lv9/b$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lv9/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private a:Lv9/b$e;

.field private b:Lv9/b$b;

.field private c:Lv9/b$d;

.field private d:Lv9/b$c;

.field private e:Ljava/lang/String;

.field private f:Z

.field private g:I


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Lv9/b$e;->u1()Lv9/b$e$a;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lv9/b$e$a;->b(Z)Lv9/b$e$a;

    invoke-virtual {v0}, Lv9/b$e$a;->a()Lv9/b$e;

    move-result-object v0

    iput-object v0, p0, Lv9/b$a;->a:Lv9/b$e;

    invoke-static {}, Lv9/b$b;->u1()Lv9/b$b$a;

    move-result-object v0

    invoke-virtual {v0, v1}, Lv9/b$b$a;->b(Z)Lv9/b$b$a;

    invoke-virtual {v0}, Lv9/b$b$a;->a()Lv9/b$b;

    move-result-object v0

    iput-object v0, p0, Lv9/b$a;->b:Lv9/b$b;

    invoke-static {}, Lv9/b$d;->u1()Lv9/b$d$a;

    move-result-object v0

    invoke-virtual {v0, v1}, Lv9/b$d$a;->b(Z)Lv9/b$d$a;

    invoke-virtual {v0}, Lv9/b$d$a;->a()Lv9/b$d;

    move-result-object v0

    iput-object v0, p0, Lv9/b$a;->c:Lv9/b$d;

    invoke-static {}, Lv9/b$c;->u1()Lv9/b$c$a;

    move-result-object v0

    invoke-virtual {v0, v1}, Lv9/b$c$a;->b(Z)Lv9/b$c$a;

    invoke-virtual {v0}, Lv9/b$c$a;->a()Lv9/b$c;

    move-result-object v0

    iput-object v0, p0, Lv9/b$a;->d:Lv9/b$c;

    return-void
.end method


# virtual methods
.method public a()Lv9/b;
    .locals 9

    new-instance v8, Lv9/b;

    iget-object v1, p0, Lv9/b$a;->a:Lv9/b$e;

    iget-object v2, p0, Lv9/b$a;->b:Lv9/b$b;

    iget-object v3, p0, Lv9/b$a;->e:Ljava/lang/String;

    iget-boolean v4, p0, Lv9/b$a;->f:Z

    iget v5, p0, Lv9/b$a;->g:I

    iget-object v6, p0, Lv9/b$a;->c:Lv9/b$d;

    iget-object v7, p0, Lv9/b$a;->d:Lv9/b$c;

    move-object v0, v8

    invoke-direct/range {v0 .. v7}, Lv9/b;-><init>(Lv9/b$e;Lv9/b$b;Ljava/lang/String;ZILv9/b$d;Lv9/b$c;)V

    return-object v8
.end method

.method public b(Z)Lv9/b$a;
    .locals 0

    iput-boolean p1, p0, Lv9/b$a;->f:Z

    return-object p0
.end method

.method public c(Lv9/b$b;)Lv9/b$a;
    .locals 0

    invoke-static {p1}, Lcom/google/android/gms/common/internal/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lv9/b$b;

    iput-object p1, p0, Lv9/b$a;->b:Lv9/b$b;

    return-object p0
.end method

.method public d(Lv9/b$c;)Lv9/b$a;
    .locals 0

    invoke-static {p1}, Lcom/google/android/gms/common/internal/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lv9/b$c;

    iput-object p1, p0, Lv9/b$a;->d:Lv9/b$c;

    return-object p0
.end method

.method public e(Lv9/b$d;)Lv9/b$a;
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-static {p1}, Lcom/google/android/gms/common/internal/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lv9/b$d;

    iput-object p1, p0, Lv9/b$a;->c:Lv9/b$d;

    return-object p0
.end method

.method public f(Lv9/b$e;)Lv9/b$a;
    .locals 0

    invoke-static {p1}, Lcom/google/android/gms/common/internal/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lv9/b$e;

    iput-object p1, p0, Lv9/b$a;->a:Lv9/b$e;

    return-object p0
.end method

.method public final g(Ljava/lang/String;)Lv9/b$a;
    .locals 0

    iput-object p1, p0, Lv9/b$a;->e:Ljava/lang/String;

    return-object p0
.end method

.method public final h(I)Lv9/b$a;
    .locals 0

    iput p1, p0, Lv9/b$a;->g:I

    return-object p0
.end method
