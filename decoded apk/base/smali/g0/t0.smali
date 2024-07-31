.class public final synthetic Lg0/t0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lg0/v0;

.field public final synthetic b:Lg0/n0;

.field public final synthetic c:Ljava/util/Map$Entry;


# direct methods
.method public synthetic constructor <init>(Lg0/v0;Lg0/n0;Ljava/util/Map$Entry;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg0/t0;->a:Lg0/v0;

    iput-object p2, p0, Lg0/t0;->b:Lg0/n0;

    iput-object p3, p0, Lg0/t0;->c:Ljava/util/Map$Entry;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lg0/t0;->a:Lg0/v0;

    iget-object v1, p0, Lg0/t0;->b:Lg0/n0;

    iget-object v2, p0, Lg0/t0;->c:Ljava/util/Map$Entry;

    invoke-static {v0, v1, v2}, Lg0/v0;->b(Lg0/v0;Lg0/n0;Ljava/util/Map$Entry;)V

    return-void
.end method
