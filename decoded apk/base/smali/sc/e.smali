.class public final Lsc/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcf/f;


# instance fields
.field private final a:Lwc/n;


# direct methods
.method public constructor <init>(Lwc/n;)V
    .locals 1

    const-string v0, "userMetadata"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lsc/e;->a:Lwc/n;

    return-void
.end method


# virtual methods
.method public a(Lcf/e;)V
    .locals 9

    const-string v0, "rolloutsState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lsc/e;->a:Lwc/n;

    invoke-virtual {p1}, Lcf/e;->b()Ljava/util/Set;

    move-result-object p1

    const-string v1, "rolloutsState.rolloutAssignments"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {p1, v2}, Ldk/p;->r(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcf/d;

    invoke-virtual {v2}, Lcf/d;->d()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2}, Lcf/d;->b()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2}, Lcf/d;->c()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2}, Lcf/d;->f()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v2}, Lcf/d;->e()J

    move-result-wide v7

    invoke-static/range {v3 .. v8}, Lwc/i;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)Lwc/i;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-virtual {v0, v1}, Lwc/n;->s(Ljava/util/List;)Z

    invoke-static {}, Lsc/g;->f()Lsc/g;

    move-result-object p1

    const-string v0, "Updated Crashlytics Rollout State"

    invoke-virtual {p1, v0}, Lsc/g;->b(Ljava/lang/String;)V

    return-void
.end method
