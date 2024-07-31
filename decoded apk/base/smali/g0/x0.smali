.class public final synthetic Lg0/x0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lg0/y0;

.field public final synthetic b:Lw/x0;


# direct methods
.method public synthetic constructor <init>(Lg0/y0;Lw/x0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg0/x0;->a:Lg0/y0;

    iput-object p2, p0, Lg0/x0;->b:Lw/x0;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lg0/x0;->a:Lg0/y0;

    iget-object v1, p0, Lg0/x0;->b:Lw/x0;

    invoke-static {v0, v1}, Lg0/y0;->e(Lg0/y0;Lw/x0;)V

    return-void
.end method
