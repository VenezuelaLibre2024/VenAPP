.class public final synthetic Lrf/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lpc/g;


# static fields
.field public static final synthetic a:Lrf/c;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lrf/c;

    invoke-direct {v0}, Lrf/c;-><init>()V

    sput-object v0, Lrf/c;->a:Lrf/c;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lpc/d;)Ljava/lang/Object;
    .locals 1

    const-class v0, Ltf/c$a;

    invoke-interface {p1, v0}, Lpc/d;->c(Ljava/lang/Class;)Ljava/util/Set;

    move-result-object p1

    new-instance v0, Ltf/c;

    invoke-direct {v0, p1}, Ltf/c;-><init>(Ljava/util/Set;)V

    return-object v0
.end method
