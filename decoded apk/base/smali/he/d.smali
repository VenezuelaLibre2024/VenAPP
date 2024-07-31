.class public abstract Lhe/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lhe/d$a;
    }
.end annotation


# static fields
.field public static a:Lhe/d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    invoke-static {}, Lhe/d;->a()Lhe/d$a;

    move-result-object v0

    invoke-virtual {v0}, Lhe/d$a;->a()Lhe/d;

    move-result-object v0

    sput-object v0, Lhe/d;->a:Lhe/d;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Lhe/d$a;
    .locals 4

    new-instance v0, Lhe/a$b;

    invoke-direct {v0}, Lhe/a$b;-><init>()V

    const-wide/16 v1, 0x0

    invoke-virtual {v0, v1, v2}, Lhe/a$b;->h(J)Lhe/d$a;

    move-result-object v0

    sget-object v3, Lhe/c$a;->ATTEMPT_MIGRATION:Lhe/c$a;

    invoke-virtual {v0, v3}, Lhe/d$a;->g(Lhe/c$a;)Lhe/d$a;

    move-result-object v0

    invoke-virtual {v0, v1, v2}, Lhe/d$a;->c(J)Lhe/d$a;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public abstract b()Ljava/lang/String;
.end method

.method public abstract c()J
.end method

.method public abstract d()Ljava/lang/String;
.end method

.method public abstract e()Ljava/lang/String;
.end method

.method public abstract f()Ljava/lang/String;
.end method

.method public abstract g()Lhe/c$a;
.end method

.method public abstract h()J
.end method

.method public i()Z
    .locals 2

    invoke-virtual {p0}, Lhe/d;->g()Lhe/c$a;

    move-result-object v0

    sget-object v1, Lhe/c$a;->REGISTER_ERROR:Lhe/c$a;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public j()Z
    .locals 2

    invoke-virtual {p0}, Lhe/d;->g()Lhe/c$a;

    move-result-object v0

    sget-object v1, Lhe/c$a;->NOT_GENERATED:Lhe/c$a;

    if-eq v0, v1, :cond_1

    invoke-virtual {p0}, Lhe/d;->g()Lhe/c$a;

    move-result-object v0

    sget-object v1, Lhe/c$a;->ATTEMPT_MIGRATION:Lhe/c$a;

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public k()Z
    .locals 2

    invoke-virtual {p0}, Lhe/d;->g()Lhe/c$a;

    move-result-object v0

    sget-object v1, Lhe/c$a;->REGISTERED:Lhe/c$a;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public l()Z
    .locals 2

    invoke-virtual {p0}, Lhe/d;->g()Lhe/c$a;

    move-result-object v0

    sget-object v1, Lhe/c$a;->UNREGISTERED:Lhe/c$a;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public m()Z
    .locals 2

    invoke-virtual {p0}, Lhe/d;->g()Lhe/c$a;

    move-result-object v0

    sget-object v1, Lhe/c$a;->ATTEMPT_MIGRATION:Lhe/c$a;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public abstract n()Lhe/d$a;
.end method

.method public o(Ljava/lang/String;JJ)Lhe/d;
    .locals 1

    invoke-virtual {p0}, Lhe/d;->n()Lhe/d$a;

    move-result-object v0

    invoke-virtual {v0, p1}, Lhe/d$a;->b(Ljava/lang/String;)Lhe/d$a;

    move-result-object p1

    invoke-virtual {p1, p2, p3}, Lhe/d$a;->c(J)Lhe/d$a;

    move-result-object p1

    invoke-virtual {p1, p4, p5}, Lhe/d$a;->h(J)Lhe/d$a;

    move-result-object p1

    invoke-virtual {p1}, Lhe/d$a;->a()Lhe/d;

    move-result-object p1

    return-object p1
.end method

.method public p()Lhe/d;
    .locals 2

    invoke-virtual {p0}, Lhe/d;->n()Lhe/d$a;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lhe/d$a;->b(Ljava/lang/String;)Lhe/d$a;

    move-result-object v0

    invoke-virtual {v0}, Lhe/d$a;->a()Lhe/d;

    move-result-object v0

    return-object v0
.end method

.method public q(Ljava/lang/String;)Lhe/d;
    .locals 1

    invoke-virtual {p0}, Lhe/d;->n()Lhe/d$a;

    move-result-object v0

    invoke-virtual {v0, p1}, Lhe/d$a;->e(Ljava/lang/String;)Lhe/d$a;

    move-result-object p1

    sget-object v0, Lhe/c$a;->REGISTER_ERROR:Lhe/c$a;

    invoke-virtual {p1, v0}, Lhe/d$a;->g(Lhe/c$a;)Lhe/d$a;

    move-result-object p1

    invoke-virtual {p1}, Lhe/d$a;->a()Lhe/d;

    move-result-object p1

    return-object p1
.end method

.method public r()Lhe/d;
    .locals 2

    invoke-virtual {p0}, Lhe/d;->n()Lhe/d$a;

    move-result-object v0

    sget-object v1, Lhe/c$a;->NOT_GENERATED:Lhe/c$a;

    invoke-virtual {v0, v1}, Lhe/d$a;->g(Lhe/c$a;)Lhe/d$a;

    move-result-object v0

    invoke-virtual {v0}, Lhe/d$a;->a()Lhe/d;

    move-result-object v0

    return-object v0
.end method

.method public s(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;J)Lhe/d;
    .locals 1

    invoke-virtual {p0}, Lhe/d;->n()Lhe/d$a;

    move-result-object v0

    invoke-virtual {v0, p1}, Lhe/d$a;->d(Ljava/lang/String;)Lhe/d$a;

    move-result-object p1

    sget-object v0, Lhe/c$a;->REGISTERED:Lhe/c$a;

    invoke-virtual {p1, v0}, Lhe/d$a;->g(Lhe/c$a;)Lhe/d$a;

    move-result-object p1

    invoke-virtual {p1, p5}, Lhe/d$a;->b(Ljava/lang/String;)Lhe/d$a;

    move-result-object p1

    invoke-virtual {p1, p2}, Lhe/d$a;->f(Ljava/lang/String;)Lhe/d$a;

    move-result-object p1

    invoke-virtual {p1, p6, p7}, Lhe/d$a;->c(J)Lhe/d$a;

    move-result-object p1

    invoke-virtual {p1, p3, p4}, Lhe/d$a;->h(J)Lhe/d$a;

    move-result-object p1

    invoke-virtual {p1}, Lhe/d$a;->a()Lhe/d;

    move-result-object p1

    return-object p1
.end method

.method public t(Ljava/lang/String;)Lhe/d;
    .locals 1

    invoke-virtual {p0}, Lhe/d;->n()Lhe/d$a;

    move-result-object v0

    invoke-virtual {v0, p1}, Lhe/d$a;->d(Ljava/lang/String;)Lhe/d$a;

    move-result-object p1

    sget-object v0, Lhe/c$a;->UNREGISTERED:Lhe/c$a;

    invoke-virtual {p1, v0}, Lhe/d$a;->g(Lhe/c$a;)Lhe/d$a;

    move-result-object p1

    invoke-virtual {p1}, Lhe/d$a;->a()Lhe/d;

    move-result-object p1

    return-object p1
.end method
