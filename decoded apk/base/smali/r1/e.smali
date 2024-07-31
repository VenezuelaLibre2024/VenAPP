.class public final Lr1/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv1/j$c;


# instance fields
.field private final a:Lv1/j$c;

.field private final b:Lr1/c;


# direct methods
.method public constructor <init>(Lv1/j$c;Lr1/c;)V
    .locals 1

    const-string v0, "delegate"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "autoCloser"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr1/e;->a:Lv1/j$c;

    iput-object p2, p0, Lr1/e;->b:Lr1/c;

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Lv1/j$b;)Lv1/j;
    .locals 0

    invoke-virtual {p0, p1}, Lr1/e;->b(Lv1/j$b;)Lr1/d;

    move-result-object p1

    return-object p1
.end method

.method public b(Lv1/j$b;)Lr1/d;
    .locals 2

    const-string v0, "configuration"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lr1/d;

    iget-object v1, p0, Lr1/e;->a:Lv1/j$c;

    invoke-interface {v1, p1}, Lv1/j$c;->a(Lv1/j$b;)Lv1/j;

    move-result-object p1

    iget-object v1, p0, Lr1/e;->b:Lr1/c;

    invoke-direct {v0, p1, v1}, Lr1/d;-><init>(Lv1/j;Lr1/c;)V

    return-object v0
.end method
