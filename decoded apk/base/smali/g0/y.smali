.class public final synthetic Lg0/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lg0/z;

.field public final synthetic b:Lw/k0$a;

.field public final synthetic c:Landroidx/concurrent/futures/c$a;


# direct methods
.method public synthetic constructor <init>(Lg0/z;Lw/k0$a;Landroidx/concurrent/futures/c$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg0/y;->a:Lg0/z;

    iput-object p2, p0, Lg0/y;->b:Lw/k0$a;

    iput-object p3, p0, Lg0/y;->c:Landroidx/concurrent/futures/c$a;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lg0/y;->a:Lg0/z;

    iget-object v1, p0, Lg0/y;->b:Lw/k0$a;

    iget-object v2, p0, Lg0/y;->c:Landroidx/concurrent/futures/c$a;

    invoke-static {v0, v1, v2}, Lg0/z;->a(Lg0/z;Lw/k0$a;Landroidx/concurrent/futures/c$a;)V

    return-void
.end method
