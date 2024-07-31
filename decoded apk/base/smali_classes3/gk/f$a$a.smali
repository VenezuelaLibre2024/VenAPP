.class final Lgk/f$a$a;
.super Lkotlin/jvm/internal/o;
.source "SourceFile"

# interfaces
.implements Lok/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lgk/f$a;->a(Lgk/f;Lgk/f;)Lgk/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/o;",
        "Lok/p<",
        "Lgk/f;",
        "Lgk/f$b;",
        "Lgk/f;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:Lgk/f$a$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lgk/f$a$a;

    invoke-direct {v0}, Lgk/f$a$a;-><init>()V

    sput-object v0, Lgk/f$a$a;->a:Lgk/f$a$a;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/o;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lgk/f;Lgk/f$b;)Lgk/f;
    .locals 3

    const-string v0, "acc"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "element"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p2}, Lgk/f$b;->getKey()Lgk/f$c;

    move-result-object v0

    invoke-interface {p1, v0}, Lgk/f;->Q(Lgk/f$c;)Lgk/f;

    move-result-object p1

    sget-object v0, Lgk/g;->a:Lgk/g;

    if-ne p1, v0, :cond_0

    goto :goto_1

    :cond_0
    sget-object v1, Lgk/d;->n:Lgk/d$b;

    invoke-interface {p1, v1}, Lgk/f;->b(Lgk/f$c;)Lgk/f$b;

    move-result-object v2

    check-cast v2, Lgk/d;

    if-nez v2, :cond_1

    new-instance v0, Lgk/c;

    invoke-direct {v0, p1, p2}, Lgk/c;-><init>(Lgk/f;Lgk/f$b;)V

    :goto_0
    move-object p2, v0

    goto :goto_1

    :cond_1
    invoke-interface {p1, v1}, Lgk/f;->Q(Lgk/f$c;)Lgk/f;

    move-result-object p1

    if-ne p1, v0, :cond_2

    new-instance p1, Lgk/c;

    invoke-direct {p1, p2, v2}, Lgk/c;-><init>(Lgk/f;Lgk/f$b;)V

    move-object p2, p1

    goto :goto_1

    :cond_2
    new-instance v0, Lgk/c;

    new-instance v1, Lgk/c;

    invoke-direct {v1, p1, p2}, Lgk/c;-><init>(Lgk/f;Lgk/f$b;)V

    invoke-direct {v0, v1, v2}, Lgk/c;-><init>(Lgk/f;Lgk/f$b;)V

    goto :goto_0

    :goto_1
    return-object p2
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lgk/f;

    check-cast p2, Lgk/f$b;

    invoke-virtual {p0, p1, p2}, Lgk/f$a$a;->a(Lgk/f;Lgk/f$b;)Lgk/f;

    move-result-object p1

    return-object p1
.end method
