.class public final synthetic Lg0/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lg0/u;

.field public final synthetic b:Lw/x0;


# direct methods
.method public synthetic constructor <init>(Lg0/u;Lw/x0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg0/f;->a:Lg0/u;

    iput-object p2, p0, Lg0/f;->b:Lw/x0;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lg0/f;->a:Lg0/u;

    iget-object v1, p0, Lg0/f;->b:Lw/x0;

    invoke-static {v0, v1}, Lg0/u;->f(Lg0/u;Lw/x0;)V

    return-void
.end method
