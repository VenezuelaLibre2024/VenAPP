.class final Lcom/google/firebase/messaging/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljd/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/firebase/messaging/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljd/d<",
        "Lme/a;",
        ">;"
    }
.end annotation


# static fields
.field static final a:Lcom/google/firebase/messaging/a$a;

.field private static final b:Ljd/c;

.field private static final c:Ljd/c;

.field private static final d:Ljd/c;

.field private static final e:Ljd/c;

.field private static final f:Ljd/c;

.field private static final g:Ljd/c;

.field private static final h:Ljd/c;

.field private static final i:Ljd/c;

.field private static final j:Ljd/c;

.field private static final k:Ljd/c;

.field private static final l:Ljd/c;

.field private static final m:Ljd/c;

.field private static final n:Ljd/c;

.field private static final o:Ljd/c;

.field private static final p:Ljd/c;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/google/firebase/messaging/a$a;

    invoke-direct {v0}, Lcom/google/firebase/messaging/a$a;-><init>()V

    sput-object v0, Lcom/google/firebase/messaging/a$a;->a:Lcom/google/firebase/messaging/a$a;

    const-string v0, "projectNumber"

    invoke-static {v0}, Ljd/c;->a(Ljava/lang/String;)Ljd/c$b;

    move-result-object v0

    invoke-static {}, Lmd/a;->b()Lmd/a;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Lmd/a;->c(I)Lmd/a;

    move-result-object v1

    invoke-virtual {v1}, Lmd/a;->a()Lmd/d;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljd/c$b;->b(Ljava/lang/annotation/Annotation;)Ljd/c$b;

    move-result-object v0

    invoke-virtual {v0}, Ljd/c$b;->a()Ljd/c;

    move-result-object v0

    sput-object v0, Lcom/google/firebase/messaging/a$a;->b:Ljd/c;

    const-string v0, "messageId"

    invoke-static {v0}, Ljd/c;->a(Ljava/lang/String;)Ljd/c$b;

    move-result-object v0

    invoke-static {}, Lmd/a;->b()Lmd/a;

    move-result-object v1

    const/4 v2, 0x2

    invoke-virtual {v1, v2}, Lmd/a;->c(I)Lmd/a;

    move-result-object v1

    invoke-virtual {v1}, Lmd/a;->a()Lmd/d;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljd/c$b;->b(Ljava/lang/annotation/Annotation;)Ljd/c$b;

    move-result-object v0

    invoke-virtual {v0}, Ljd/c$b;->a()Ljd/c;

    move-result-object v0

    sput-object v0, Lcom/google/firebase/messaging/a$a;->c:Ljd/c;

    const-string v0, "instanceId"

    invoke-static {v0}, Ljd/c;->a(Ljava/lang/String;)Ljd/c$b;

    move-result-object v0

    invoke-static {}, Lmd/a;->b()Lmd/a;

    move-result-object v1

    const/4 v2, 0x3

    invoke-virtual {v1, v2}, Lmd/a;->c(I)Lmd/a;

    move-result-object v1

    invoke-virtual {v1}, Lmd/a;->a()Lmd/d;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljd/c$b;->b(Ljava/lang/annotation/Annotation;)Ljd/c$b;

    move-result-object v0

    invoke-virtual {v0}, Ljd/c$b;->a()Ljd/c;

    move-result-object v0

    sput-object v0, Lcom/google/firebase/messaging/a$a;->d:Ljd/c;

    const-string v0, "messageType"

    invoke-static {v0}, Ljd/c;->a(Ljava/lang/String;)Ljd/c$b;

    move-result-object v0

    invoke-static {}, Lmd/a;->b()Lmd/a;

    move-result-object v1

    const/4 v2, 0x4

    invoke-virtual {v1, v2}, Lmd/a;->c(I)Lmd/a;

    move-result-object v1

    invoke-virtual {v1}, Lmd/a;->a()Lmd/d;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljd/c$b;->b(Ljava/lang/annotation/Annotation;)Ljd/c$b;

    move-result-object v0

    invoke-virtual {v0}, Ljd/c$b;->a()Ljd/c;

    move-result-object v0

    sput-object v0, Lcom/google/firebase/messaging/a$a;->e:Ljd/c;

    const-string v0, "sdkPlatform"

    invoke-static {v0}, Ljd/c;->a(Ljava/lang/String;)Ljd/c$b;

    move-result-object v0

    invoke-static {}, Lmd/a;->b()Lmd/a;

    move-result-object v1

    const/4 v2, 0x5

    invoke-virtual {v1, v2}, Lmd/a;->c(I)Lmd/a;

    move-result-object v1

    invoke-virtual {v1}, Lmd/a;->a()Lmd/d;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljd/c$b;->b(Ljava/lang/annotation/Annotation;)Ljd/c$b;

    move-result-object v0

    invoke-virtual {v0}, Ljd/c$b;->a()Ljd/c;

    move-result-object v0

    sput-object v0, Lcom/google/firebase/messaging/a$a;->f:Ljd/c;

    const-string v0, "packageName"

    invoke-static {v0}, Ljd/c;->a(Ljava/lang/String;)Ljd/c$b;

    move-result-object v0

    invoke-static {}, Lmd/a;->b()Lmd/a;

    move-result-object v1

    const/4 v2, 0x6

    invoke-virtual {v1, v2}, Lmd/a;->c(I)Lmd/a;

    move-result-object v1

    invoke-virtual {v1}, Lmd/a;->a()Lmd/d;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljd/c$b;->b(Ljava/lang/annotation/Annotation;)Ljd/c$b;

    move-result-object v0

    invoke-virtual {v0}, Ljd/c$b;->a()Ljd/c;

    move-result-object v0

    sput-object v0, Lcom/google/firebase/messaging/a$a;->g:Ljd/c;

    const-string v0, "collapseKey"

    invoke-static {v0}, Ljd/c;->a(Ljava/lang/String;)Ljd/c$b;

    move-result-object v0

    invoke-static {}, Lmd/a;->b()Lmd/a;

    move-result-object v1

    const/4 v2, 0x7

    invoke-virtual {v1, v2}, Lmd/a;->c(I)Lmd/a;

    move-result-object v1

    invoke-virtual {v1}, Lmd/a;->a()Lmd/d;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljd/c$b;->b(Ljava/lang/annotation/Annotation;)Ljd/c$b;

    move-result-object v0

    invoke-virtual {v0}, Ljd/c$b;->a()Ljd/c;

    move-result-object v0

    sput-object v0, Lcom/google/firebase/messaging/a$a;->h:Ljd/c;

    const-string v0, "priority"

    invoke-static {v0}, Ljd/c;->a(Ljava/lang/String;)Ljd/c$b;

    move-result-object v0

    invoke-static {}, Lmd/a;->b()Lmd/a;

    move-result-object v1

    const/16 v2, 0x8

    invoke-virtual {v1, v2}, Lmd/a;->c(I)Lmd/a;

    move-result-object v1

    invoke-virtual {v1}, Lmd/a;->a()Lmd/d;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljd/c$b;->b(Ljava/lang/annotation/Annotation;)Ljd/c$b;

    move-result-object v0

    invoke-virtual {v0}, Ljd/c$b;->a()Ljd/c;

    move-result-object v0

    sput-object v0, Lcom/google/firebase/messaging/a$a;->i:Ljd/c;

    const-string v0, "ttl"

    invoke-static {v0}, Ljd/c;->a(Ljava/lang/String;)Ljd/c$b;

    move-result-object v0

    invoke-static {}, Lmd/a;->b()Lmd/a;

    move-result-object v1

    const/16 v2, 0x9

    invoke-virtual {v1, v2}, Lmd/a;->c(I)Lmd/a;

    move-result-object v1

    invoke-virtual {v1}, Lmd/a;->a()Lmd/d;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljd/c$b;->b(Ljava/lang/annotation/Annotation;)Ljd/c$b;

    move-result-object v0

    invoke-virtual {v0}, Ljd/c$b;->a()Ljd/c;

    move-result-object v0

    sput-object v0, Lcom/google/firebase/messaging/a$a;->j:Ljd/c;

    const-string v0, "topic"

    invoke-static {v0}, Ljd/c;->a(Ljava/lang/String;)Ljd/c$b;

    move-result-object v0

    invoke-static {}, Lmd/a;->b()Lmd/a;

    move-result-object v1

    const/16 v2, 0xa

    invoke-virtual {v1, v2}, Lmd/a;->c(I)Lmd/a;

    move-result-object v1

    invoke-virtual {v1}, Lmd/a;->a()Lmd/d;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljd/c$b;->b(Ljava/lang/annotation/Annotation;)Ljd/c$b;

    move-result-object v0

    invoke-virtual {v0}, Ljd/c$b;->a()Ljd/c;

    move-result-object v0

    sput-object v0, Lcom/google/firebase/messaging/a$a;->k:Ljd/c;

    const-string v0, "bulkId"

    invoke-static {v0}, Ljd/c;->a(Ljava/lang/String;)Ljd/c$b;

    move-result-object v0

    invoke-static {}, Lmd/a;->b()Lmd/a;

    move-result-object v1

    const/16 v2, 0xb

    invoke-virtual {v1, v2}, Lmd/a;->c(I)Lmd/a;

    move-result-object v1

    invoke-virtual {v1}, Lmd/a;->a()Lmd/d;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljd/c$b;->b(Ljava/lang/annotation/Annotation;)Ljd/c$b;

    move-result-object v0

    invoke-virtual {v0}, Ljd/c$b;->a()Ljd/c;

    move-result-object v0

    sput-object v0, Lcom/google/firebase/messaging/a$a;->l:Ljd/c;

    const-string v0, "event"

    invoke-static {v0}, Ljd/c;->a(Ljava/lang/String;)Ljd/c$b;

    move-result-object v0

    invoke-static {}, Lmd/a;->b()Lmd/a;

    move-result-object v1

    const/16 v2, 0xc

    invoke-virtual {v1, v2}, Lmd/a;->c(I)Lmd/a;

    move-result-object v1

    invoke-virtual {v1}, Lmd/a;->a()Lmd/d;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljd/c$b;->b(Ljava/lang/annotation/Annotation;)Ljd/c$b;

    move-result-object v0

    invoke-virtual {v0}, Ljd/c$b;->a()Ljd/c;

    move-result-object v0

    sput-object v0, Lcom/google/firebase/messaging/a$a;->m:Ljd/c;

    const-string v0, "analyticsLabel"

    invoke-static {v0}, Ljd/c;->a(Ljava/lang/String;)Ljd/c$b;

    move-result-object v0

    invoke-static {}, Lmd/a;->b()Lmd/a;

    move-result-object v1

    const/16 v2, 0xd

    invoke-virtual {v1, v2}, Lmd/a;->c(I)Lmd/a;

    move-result-object v1

    invoke-virtual {v1}, Lmd/a;->a()Lmd/d;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljd/c$b;->b(Ljava/lang/annotation/Annotation;)Ljd/c$b;

    move-result-object v0

    invoke-virtual {v0}, Ljd/c$b;->a()Ljd/c;

    move-result-object v0

    sput-object v0, Lcom/google/firebase/messaging/a$a;->n:Ljd/c;

    const-string v0, "campaignId"

    invoke-static {v0}, Ljd/c;->a(Ljava/lang/String;)Ljd/c$b;

    move-result-object v0

    invoke-static {}, Lmd/a;->b()Lmd/a;

    move-result-object v1

    const/16 v2, 0xe

    invoke-virtual {v1, v2}, Lmd/a;->c(I)Lmd/a;

    move-result-object v1

    invoke-virtual {v1}, Lmd/a;->a()Lmd/d;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljd/c$b;->b(Ljava/lang/annotation/Annotation;)Ljd/c$b;

    move-result-object v0

    invoke-virtual {v0}, Ljd/c$b;->a()Ljd/c;

    move-result-object v0

    sput-object v0, Lcom/google/firebase/messaging/a$a;->o:Ljd/c;

    const-string v0, "composerLabel"

    invoke-static {v0}, Ljd/c;->a(Ljava/lang/String;)Ljd/c$b;

    move-result-object v0

    invoke-static {}, Lmd/a;->b()Lmd/a;

    move-result-object v1

    const/16 v2, 0xf

    invoke-virtual {v1, v2}, Lmd/a;->c(I)Lmd/a;

    move-result-object v1

    invoke-virtual {v1}, Lmd/a;->a()Lmd/d;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljd/c$b;->b(Ljava/lang/annotation/Annotation;)Ljd/c$b;

    move-result-object v0

    invoke-virtual {v0}, Ljd/c$b;->a()Ljd/c;

    move-result-object v0

    sput-object v0, Lcom/google/firebase/messaging/a$a;->p:Ljd/c;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lme/a;Ljd/e;)V
    .locals 3

    sget-object v0, Lcom/google/firebase/messaging/a$a;->b:Ljd/c;

    invoke-virtual {p1}, Lme/a;->l()J

    move-result-wide v1

    invoke-interface {p2, v0, v1, v2}, Ljd/e;->add(Ljd/c;J)Ljd/e;

    sget-object v0, Lcom/google/firebase/messaging/a$a;->c:Ljd/c;

    invoke-virtual {p1}, Lme/a;->h()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ljd/e;->add(Ljd/c;Ljava/lang/Object;)Ljd/e;

    sget-object v0, Lcom/google/firebase/messaging/a$a;->d:Ljd/c;

    invoke-virtual {p1}, Lme/a;->g()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ljd/e;->add(Ljd/c;Ljava/lang/Object;)Ljd/e;

    sget-object v0, Lcom/google/firebase/messaging/a$a;->e:Ljd/c;

    invoke-virtual {p1}, Lme/a;->i()Lme/a$c;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ljd/e;->add(Ljd/c;Ljava/lang/Object;)Ljd/e;

    sget-object v0, Lcom/google/firebase/messaging/a$a;->f:Ljd/c;

    invoke-virtual {p1}, Lme/a;->m()Lme/a$d;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ljd/e;->add(Ljd/c;Ljava/lang/Object;)Ljd/e;

    sget-object v0, Lcom/google/firebase/messaging/a$a;->g:Ljd/c;

    invoke-virtual {p1}, Lme/a;->j()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ljd/e;->add(Ljd/c;Ljava/lang/Object;)Ljd/e;

    sget-object v0, Lcom/google/firebase/messaging/a$a;->h:Ljd/c;

    invoke-virtual {p1}, Lme/a;->d()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ljd/e;->add(Ljd/c;Ljava/lang/Object;)Ljd/e;

    sget-object v0, Lcom/google/firebase/messaging/a$a;->i:Ljd/c;

    invoke-virtual {p1}, Lme/a;->k()I

    move-result v1

    invoke-interface {p2, v0, v1}, Ljd/e;->add(Ljd/c;I)Ljd/e;

    sget-object v0, Lcom/google/firebase/messaging/a$a;->j:Ljd/c;

    invoke-virtual {p1}, Lme/a;->o()I

    move-result v1

    invoke-interface {p2, v0, v1}, Ljd/e;->add(Ljd/c;I)Ljd/e;

    sget-object v0, Lcom/google/firebase/messaging/a$a;->k:Ljd/c;

    invoke-virtual {p1}, Lme/a;->n()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ljd/e;->add(Ljd/c;Ljava/lang/Object;)Ljd/e;

    sget-object v0, Lcom/google/firebase/messaging/a$a;->l:Ljd/c;

    invoke-virtual {p1}, Lme/a;->b()J

    move-result-wide v1

    invoke-interface {p2, v0, v1, v2}, Ljd/e;->add(Ljd/c;J)Ljd/e;

    sget-object v0, Lcom/google/firebase/messaging/a$a;->m:Ljd/c;

    invoke-virtual {p1}, Lme/a;->f()Lme/a$b;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ljd/e;->add(Ljd/c;Ljava/lang/Object;)Ljd/e;

    sget-object v0, Lcom/google/firebase/messaging/a$a;->n:Ljd/c;

    invoke-virtual {p1}, Lme/a;->a()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ljd/e;->add(Ljd/c;Ljava/lang/Object;)Ljd/e;

    sget-object v0, Lcom/google/firebase/messaging/a$a;->o:Ljd/c;

    invoke-virtual {p1}, Lme/a;->c()J

    move-result-wide v1

    invoke-interface {p2, v0, v1, v2}, Ljd/e;->add(Ljd/c;J)Ljd/e;

    sget-object v0, Lcom/google/firebase/messaging/a$a;->p:Ljd/c;

    invoke-virtual {p1}, Lme/a;->e()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p2, v0, p1}, Ljd/e;->add(Ljd/c;Ljava/lang/Object;)Ljd/e;

    return-void
.end method

.method public bridge synthetic encode(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lme/a;

    check-cast p2, Ljd/e;

    invoke-virtual {p0, p1, p2}, Lcom/google/firebase/messaging/a$a;->a(Lme/a;Ljd/e;)V

    return-void
.end method
