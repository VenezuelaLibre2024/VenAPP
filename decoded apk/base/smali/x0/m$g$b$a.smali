.class public final Lx0/m$g$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcl/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lx0/m$g$b;->a(Lcl/c;Lgk/Continuation;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcl/c<",
        "Lx0/n<",
        "TT;>;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcl/c;


# direct methods
.method public constructor <init>(Lcl/c;)V
    .locals 0

    iput-object p1, p0, Lx0/m$g$b$a;->a:Lcl/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public emit(Ljava/lang/Object;Lgk/Continuation;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p2, Lx0/m$g$b$a$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lx0/m$g$b$a$a;

    iget v1, v0, Lx0/m$g$b$a$a;->b:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lx0/m$g$b$a$a;->b:I

    goto :goto_0

    :cond_0
    new-instance v0, Lx0/m$g$b$a$a;

    invoke-direct {v0, p0, p2}, Lx0/m$g$b$a$a;-><init>(Lx0/m$g$b$a;Lgk/Continuation;)V

    :goto_0
    iget-object p2, v0, Lx0/m$g$b$a$a;->a:Ljava/lang/Object;

    invoke-static {}, Lhk/b;->c()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lx0/m$g$b$a$a;->b:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p2}, Lck/o;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lck/o;->b(Ljava/lang/Object;)V

    iget-object p2, p0, Lx0/m$g$b$a;->a:Lcl/c;

    check-cast p1, Lx0/n;

    instance-of v2, p1, Lx0/j;

    if-nez v2, :cond_7

    instance-of v2, p1, Lx0/h;

    if-nez v2, :cond_6

    instance-of v2, p1, Lx0/c;

    if-eqz v2, :cond_4

    check-cast p1, Lx0/c;

    invoke-virtual {p1}, Lx0/c;->b()Ljava/lang/Object;

    move-result-object p1

    iput v3, v0, Lx0/m$g$b$a$a;->b:I

    invoke-interface {p2, p1, v0}, Lcl/c;->emit(Ljava/lang/Object;Lgk/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    sget-object p1, Lck/v;->a:Lck/v;

    return-object p1

    :cond_4
    instance-of p1, p1, Lx0/o;

    if-eqz p1, :cond_5

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    new-instance p1, Lck/l;

    invoke-direct {p1}, Lck/l;-><init>()V

    throw p1

    :cond_6
    check-cast p1, Lx0/h;

    invoke-virtual {p1}, Lx0/h;->a()Ljava/lang/Throwable;

    move-result-object p1

    throw p1

    :cond_7
    check-cast p1, Lx0/j;

    invoke-virtual {p1}, Lx0/j;->a()Ljava/lang/Throwable;

    move-result-object p1

    throw p1
.end method
