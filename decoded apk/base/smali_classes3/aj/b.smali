.class public abstract Laj/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Laj/b$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<S:",
        "Laj/b<",
        "TS;>;>",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field private final a:Lvi/d;

.field private final b:Lvi/c;


# direct methods
.method protected constructor <init>(Lvi/d;Lvi/c;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "channel"

    invoke-static {p1, v0}, Leb/o;->p(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lvi/d;

    iput-object p1, p0, Laj/b;->a:Lvi/d;

    const-string p1, "callOptions"

    invoke-static {p2, p1}, Leb/o;->p(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lvi/c;

    iput-object p1, p0, Laj/b;->b:Lvi/c;

    return-void
.end method


# virtual methods
.method protected abstract a(Lvi/d;Lvi/c;)Laj/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvi/d;",
            "Lvi/c;",
            ")TS;"
        }
    .end annotation
.end method

.method public final b()Lvi/c;
    .locals 1

    iget-object v0, p0, Laj/b;->b:Lvi/c;

    return-object v0
.end method

.method public final c()Lvi/d;
    .locals 1

    iget-object v0, p0, Laj/b;->a:Lvi/d;

    return-object v0
.end method

.method public final d(JLjava/util/concurrent/TimeUnit;)Laj/b;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Ljava/util/concurrent/TimeUnit;",
            ")TS;"
        }
    .end annotation

    iget-object v0, p0, Laj/b;->a:Lvi/d;

    iget-object v1, p0, Laj/b;->b:Lvi/c;

    invoke-virtual {v1, p1, p2, p3}, Lvi/c;->m(JLjava/util/concurrent/TimeUnit;)Lvi/c;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Laj/b;->a(Lvi/d;Lvi/c;)Laj/b;

    move-result-object p1

    return-object p1
.end method
