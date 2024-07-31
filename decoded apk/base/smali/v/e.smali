.class public final synthetic Lv/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lv/g;

.field public final synthetic b:Landroidx/concurrent/futures/c$a;


# direct methods
.method public synthetic constructor <init>(Lv/g;Landroidx/concurrent/futures/c$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv/e;->a:Lv/g;

    iput-object p2, p0, Lv/e;->b:Landroidx/concurrent/futures/c$a;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lv/e;->a:Lv/g;

    iget-object v1, p0, Lv/e;->b:Landroidx/concurrent/futures/c$a;

    invoke-static {v0, v1}, Lv/g;->b(Lv/g;Landroidx/concurrent/futures/c$a;)V

    return-void
.end method
