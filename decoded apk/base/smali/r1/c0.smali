.class public final Lr1/c0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv1/j$c;


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Ljava/io/File;

.field private final c:Ljava/util/concurrent/Callable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/Callable<",
            "Ljava/io/InputStream;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Lv1/j$c;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/io/File;Ljava/util/concurrent/Callable;Lv1/j$c;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/io/File;",
            "Ljava/util/concurrent/Callable<",
            "Ljava/io/InputStream;",
            ">;",
            "Lv1/j$c;",
            ")V"
        }
    .end annotation

    const-string v0, "mDelegate"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr1/c0;->a:Ljava/lang/String;

    iput-object p2, p0, Lr1/c0;->b:Ljava/io/File;

    iput-object p3, p0, Lr1/c0;->c:Ljava/util/concurrent/Callable;

    iput-object p4, p0, Lr1/c0;->d:Lv1/j$c;

    return-void
.end method


# virtual methods
.method public a(Lv1/j$b;)Lv1/j;
    .locals 8

    const-string v0, "configuration"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lr1/b0;

    iget-object v2, p1, Lv1/j$b;->a:Landroid/content/Context;

    iget-object v3, p0, Lr1/c0;->a:Ljava/lang/String;

    iget-object v4, p0, Lr1/c0;->b:Ljava/io/File;

    iget-object v5, p0, Lr1/c0;->c:Ljava/util/concurrent/Callable;

    iget-object v1, p1, Lv1/j$b;->c:Lv1/j$a;

    iget v6, v1, Lv1/j$a;->a:I

    iget-object v1, p0, Lr1/c0;->d:Lv1/j$c;

    invoke-interface {v1, p1}, Lv1/j$c;->a(Lv1/j$b;)Lv1/j;

    move-result-object v7

    move-object v1, v0

    invoke-direct/range {v1 .. v7}, Lr1/b0;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;Ljava/util/concurrent/Callable;ILv1/j;)V

    return-object v0
.end method
