.class public final synthetic Lg0/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/concurrent/futures/c$c;


# instance fields
.field public final synthetic a:Lg0/z;

.field public final synthetic b:Lw/k0$a;


# direct methods
.method public synthetic constructor <init>(Lg0/z;Lw/k0$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg0/x;->a:Lg0/z;

    iput-object p2, p0, Lg0/x;->b:Lw/k0$a;

    return-void
.end method


# virtual methods
.method public final a(Landroidx/concurrent/futures/c$a;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lg0/x;->a:Lg0/z;

    iget-object v1, p0, Lg0/x;->b:Lw/k0$a;

    invoke-static {v0, v1, p1}, Lg0/z;->b(Lg0/z;Lw/k0$a;Landroidx/concurrent/futures/c$a;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
