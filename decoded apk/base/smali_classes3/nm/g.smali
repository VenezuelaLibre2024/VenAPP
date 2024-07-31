.class public final synthetic Lnm/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lom/o;


# direct methods
.method public synthetic constructor <init>(Lom/o;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnm/g;->a:Lom/o;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lnm/g;->a:Lom/o;

    invoke-static {v0}, Lnm/m;->j(Lom/o;)V

    return-void
.end method
