.class public final synthetic Lg0/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lg0/u;

.field public final synthetic b:Lw/y;

.field public final synthetic c:Lg0/d0;

.field public final synthetic d:Landroidx/concurrent/futures/c$a;


# direct methods
.method public synthetic constructor <init>(Lg0/u;Lw/y;Lg0/d0;Landroidx/concurrent/futures/c$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg0/p;->a:Lg0/u;

    iput-object p2, p0, Lg0/p;->b:Lw/y;

    iput-object p3, p0, Lg0/p;->c:Lg0/d0;

    iput-object p4, p0, Lg0/p;->d:Landroidx/concurrent/futures/c$a;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lg0/p;->a:Lg0/u;

    iget-object v1, p0, Lg0/p;->b:Lw/y;

    iget-object v2, p0, Lg0/p;->c:Lg0/d0;

    iget-object v3, p0, Lg0/p;->d:Landroidx/concurrent/futures/c$a;

    invoke-static {v0, v1, v2, v3}, Lg0/u;->n(Lg0/u;Lw/y;Lg0/d0;Landroidx/concurrent/futures/c$a;)V

    return-void
.end method
