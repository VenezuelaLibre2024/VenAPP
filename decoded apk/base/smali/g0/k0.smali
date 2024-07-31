.class public final synthetic Lg0/k0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lg0/n0$a;


# direct methods
.method public synthetic constructor <init>(Lg0/n0$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg0/k0;->a:Lg0/n0$a;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lg0/k0;->a:Lg0/n0$a;

    invoke-virtual {v0}, Landroidx/camera/core/impl/r0;->e()V

    return-void
.end method
