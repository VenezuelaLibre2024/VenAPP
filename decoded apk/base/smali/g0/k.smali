.class public final synthetic Lg0/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lw/x0;


# direct methods
.method public synthetic constructor <init>(Lw/x0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg0/k;->a:Lw/x0;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lg0/k;->a:Lw/x0;

    invoke-interface {v0}, Lw/x0;->close()V

    return-void
.end method
