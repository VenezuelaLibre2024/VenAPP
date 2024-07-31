.class public final Lw1/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv1/j$c;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lv1/j$b;)Lv1/j;
    .locals 7

    const-string v0, "configuration"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lw1/d;

    iget-object v2, p1, Lv1/j$b;->a:Landroid/content/Context;

    iget-object v3, p1, Lv1/j$b;->b:Ljava/lang/String;

    iget-object v4, p1, Lv1/j$b;->c:Lv1/j$a;

    iget-boolean v5, p1, Lv1/j$b;->d:Z

    iget-boolean v6, p1, Lv1/j$b;->e:Z

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, Lw1/d;-><init>(Landroid/content/Context;Ljava/lang/String;Lv1/j$a;ZZ)V

    return-object v0
.end method
