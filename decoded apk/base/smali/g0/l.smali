.class public final synthetic Lg0/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lg0/u;

.field public final synthetic b:Lw/i1;


# direct methods
.method public synthetic constructor <init>(Lg0/u;Lw/i1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg0/l;->a:Lg0/u;

    iput-object p2, p0, Lg0/l;->b:Lw/i1;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lg0/l;->a:Lg0/u;

    iget-object v1, p0, Lg0/l;->b:Lw/i1;

    invoke-static {v0, v1}, Lg0/u;->g(Lg0/u;Lw/i1;)V

    return-void
.end method
