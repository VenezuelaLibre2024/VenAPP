.class public Landroidx/webkit/internal/j1;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final A:Landroidx/webkit/internal/a$b;

.field public static final B:Landroidx/webkit/internal/a$b;

.field public static final C:Landroidx/webkit/internal/a$d;

.field public static final D:Landroidx/webkit/internal/a$b;

.field public static final E:Landroidx/webkit/internal/a$b;

.field public static final F:Landroidx/webkit/internal/a$b;

.field public static final G:Landroidx/webkit/internal/a$b;

.field public static final H:Landroidx/webkit/internal/a$e;

.field public static final I:Landroidx/webkit/internal/a$e;

.field public static final J:Landroidx/webkit/internal/a$h;

.field public static final K:Landroidx/webkit/internal/a$h;

.field public static final L:Landroidx/webkit/internal/a$g;

.field public static final M:Landroidx/webkit/internal/z0$b;

.field public static final N:Landroidx/webkit/internal/z0$a;

.field public static final O:Landroidx/webkit/internal/a$h;

.field public static final P:Landroidx/webkit/internal/a$i;

.field public static final Q:Landroidx/webkit/internal/a$d;

.field public static final R:Landroidx/webkit/internal/a$d;

.field public static final S:Landroidx/webkit/internal/a$d;

.field public static final T:Landroidx/webkit/internal/a$h;

.field public static final U:Landroidx/webkit/internal/a$d;

.field public static final V:Landroidx/webkit/internal/a$d;

.field public static final W:Landroidx/webkit/internal/a$d;

.field public static final X:Landroidx/webkit/internal/a$d;

.field public static final Y:Landroidx/webkit/internal/a$d;

.field public static final Z:Landroidx/webkit/internal/a$d;

.field public static final a:Landroidx/webkit/internal/a$b;

.field public static final a0:Landroidx/webkit/internal/a$d;

.field public static final b:Landroidx/webkit/internal/a$b;

.field public static final b0:Landroidx/webkit/internal/a$d;

.field public static final c:Landroidx/webkit/internal/a$e;

.field public static final d:Landroidx/webkit/internal/a$c;

.field public static final e:Landroidx/webkit/internal/a$f;

.field public static final f:Landroidx/webkit/internal/a$f;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final g:Landroidx/webkit/internal/a$f;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final h:Landroidx/webkit/internal/a$f;

.field public static final i:Landroidx/webkit/internal/a$f;

.field public static final j:Landroidx/webkit/internal/a$f;

.field public static final k:Landroidx/webkit/internal/a$c;

.field public static final l:Landroidx/webkit/internal/a$c;

.field public static final m:Landroidx/webkit/internal/a$c;

.field public static final n:Landroidx/webkit/internal/a$c;

.field public static final o:Landroidx/webkit/internal/a$c;

.field public static final p:Landroidx/webkit/internal/a$c;

.field public static final q:Landroidx/webkit/internal/a$b;

.field public static final r:Landroidx/webkit/internal/a$b;

.field public static final s:Landroidx/webkit/internal/a$c;

.field public static final t:Landroidx/webkit/internal/a$f;

.field public static final u:Landroidx/webkit/internal/a$c;

.field public static final v:Landroidx/webkit/internal/a$b;

.field public static final w:Landroidx/webkit/internal/a$b;

.field public static final x:Landroidx/webkit/internal/a$f;

.field public static final y:Landroidx/webkit/internal/a$f;

.field public static final z:Landroidx/webkit/internal/a$f;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Landroidx/webkit/internal/a$b;

    const-string v1, "VISUAL_STATE_CALLBACK"

    invoke-direct {v0, v1, v1}, Landroidx/webkit/internal/a$b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Landroidx/webkit/internal/j1;->a:Landroidx/webkit/internal/a$b;

    new-instance v0, Landroidx/webkit/internal/a$b;

    const-string v1, "OFF_SCREEN_PRERASTER"

    invoke-direct {v0, v1, v1}, Landroidx/webkit/internal/a$b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Landroidx/webkit/internal/j1;->b:Landroidx/webkit/internal/a$b;

    new-instance v0, Landroidx/webkit/internal/a$e;

    const-string v1, "SAFE_BROWSING_ENABLE"

    invoke-direct {v0, v1, v1}, Landroidx/webkit/internal/a$e;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Landroidx/webkit/internal/j1;->c:Landroidx/webkit/internal/a$e;

    new-instance v0, Landroidx/webkit/internal/a$c;

    const-string v1, "DISABLED_ACTION_MODE_MENU_ITEMS"

    invoke-direct {v0, v1, v1}, Landroidx/webkit/internal/a$c;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Landroidx/webkit/internal/j1;->d:Landroidx/webkit/internal/a$c;

    new-instance v0, Landroidx/webkit/internal/a$f;

    const-string v1, "START_SAFE_BROWSING"

    invoke-direct {v0, v1, v1}, Landroidx/webkit/internal/a$f;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Landroidx/webkit/internal/j1;->e:Landroidx/webkit/internal/a$f;

    new-instance v0, Landroidx/webkit/internal/a$f;

    const-string v1, "SAFE_BROWSING_WHITELIST"

    invoke-direct {v0, v1, v1}, Landroidx/webkit/internal/a$f;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Landroidx/webkit/internal/j1;->f:Landroidx/webkit/internal/a$f;

    new-instance v0, Landroidx/webkit/internal/a$f;

    const-string v2, "SAFE_BROWSING_ALLOWLIST"

    invoke-direct {v0, v1, v2}, Landroidx/webkit/internal/a$f;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Landroidx/webkit/internal/j1;->g:Landroidx/webkit/internal/a$f;

    new-instance v0, Landroidx/webkit/internal/a$f;

    invoke-direct {v0, v2, v1}, Landroidx/webkit/internal/a$f;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Landroidx/webkit/internal/j1;->h:Landroidx/webkit/internal/a$f;

    new-instance v0, Landroidx/webkit/internal/a$f;

    invoke-direct {v0, v2, v2}, Landroidx/webkit/internal/a$f;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Landroidx/webkit/internal/j1;->i:Landroidx/webkit/internal/a$f;

    new-instance v0, Landroidx/webkit/internal/a$f;

    const-string v1, "SAFE_BROWSING_PRIVACY_POLICY_URL"

    invoke-direct {v0, v1, v1}, Landroidx/webkit/internal/a$f;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Landroidx/webkit/internal/j1;->j:Landroidx/webkit/internal/a$f;

    new-instance v0, Landroidx/webkit/internal/a$c;

    const-string v1, "SERVICE_WORKER_BASIC_USAGE"

    invoke-direct {v0, v1, v1}, Landroidx/webkit/internal/a$c;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Landroidx/webkit/internal/j1;->k:Landroidx/webkit/internal/a$c;

    new-instance v0, Landroidx/webkit/internal/a$c;

    const-string v1, "SERVICE_WORKER_CACHE_MODE"

    invoke-direct {v0, v1, v1}, Landroidx/webkit/internal/a$c;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Landroidx/webkit/internal/j1;->l:Landroidx/webkit/internal/a$c;

    new-instance v0, Landroidx/webkit/internal/a$c;

    const-string v1, "SERVICE_WORKER_CONTENT_ACCESS"

    invoke-direct {v0, v1, v1}, Landroidx/webkit/internal/a$c;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Landroidx/webkit/internal/j1;->m:Landroidx/webkit/internal/a$c;

    new-instance v0, Landroidx/webkit/internal/a$c;

    const-string v1, "SERVICE_WORKER_FILE_ACCESS"

    invoke-direct {v0, v1, v1}, Landroidx/webkit/internal/a$c;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Landroidx/webkit/internal/j1;->n:Landroidx/webkit/internal/a$c;

    new-instance v0, Landroidx/webkit/internal/a$c;

    const-string v1, "SERVICE_WORKER_BLOCK_NETWORK_LOADS"

    invoke-direct {v0, v1, v1}, Landroidx/webkit/internal/a$c;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Landroidx/webkit/internal/j1;->o:Landroidx/webkit/internal/a$c;

    new-instance v0, Landroidx/webkit/internal/a$c;

    const-string v1, "SERVICE_WORKER_SHOULD_INTERCEPT_REQUEST"

    invoke-direct {v0, v1, v1}, Landroidx/webkit/internal/a$c;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Landroidx/webkit/internal/j1;->p:Landroidx/webkit/internal/a$c;

    new-instance v0, Landroidx/webkit/internal/a$b;

    const-string v1, "RECEIVE_WEB_RESOURCE_ERROR"

    invoke-direct {v0, v1, v1}, Landroidx/webkit/internal/a$b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Landroidx/webkit/internal/j1;->q:Landroidx/webkit/internal/a$b;

    new-instance v0, Landroidx/webkit/internal/a$b;

    const-string v1, "RECEIVE_HTTP_ERROR"

    invoke-direct {v0, v1, v1}, Landroidx/webkit/internal/a$b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Landroidx/webkit/internal/j1;->r:Landroidx/webkit/internal/a$b;

    new-instance v0, Landroidx/webkit/internal/a$c;

    const-string v1, "SHOULD_OVERRIDE_WITH_REDIRECTS"

    invoke-direct {v0, v1, v1}, Landroidx/webkit/internal/a$c;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Landroidx/webkit/internal/j1;->s:Landroidx/webkit/internal/a$c;

    new-instance v0, Landroidx/webkit/internal/a$f;

    const-string v1, "SAFE_BROWSING_HIT"

    invoke-direct {v0, v1, v1}, Landroidx/webkit/internal/a$f;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Landroidx/webkit/internal/j1;->t:Landroidx/webkit/internal/a$f;

    new-instance v0, Landroidx/webkit/internal/a$c;

    const-string v1, "WEB_RESOURCE_REQUEST_IS_REDIRECT"

    invoke-direct {v0, v1, v1}, Landroidx/webkit/internal/a$c;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Landroidx/webkit/internal/j1;->u:Landroidx/webkit/internal/a$c;

    new-instance v0, Landroidx/webkit/internal/a$b;

    const-string v1, "WEB_RESOURCE_ERROR_GET_DESCRIPTION"

    invoke-direct {v0, v1, v1}, Landroidx/webkit/internal/a$b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Landroidx/webkit/internal/j1;->v:Landroidx/webkit/internal/a$b;

    new-instance v0, Landroidx/webkit/internal/a$b;

    const-string v1, "WEB_RESOURCE_ERROR_GET_CODE"

    invoke-direct {v0, v1, v1}, Landroidx/webkit/internal/a$b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Landroidx/webkit/internal/j1;->w:Landroidx/webkit/internal/a$b;

    new-instance v0, Landroidx/webkit/internal/a$f;

    const-string v1, "SAFE_BROWSING_RESPONSE_BACK_TO_SAFETY"

    invoke-direct {v0, v1, v1}, Landroidx/webkit/internal/a$f;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Landroidx/webkit/internal/j1;->x:Landroidx/webkit/internal/a$f;

    new-instance v0, Landroidx/webkit/internal/a$f;

    const-string v1, "SAFE_BROWSING_RESPONSE_PROCEED"

    const-string v2, "SAFE_BROWSING_RESPONSE_PROCEED"

    invoke-direct {v0, v1, v2}, Landroidx/webkit/internal/a$f;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Landroidx/webkit/internal/j1;->y:Landroidx/webkit/internal/a$f;

    new-instance v0, Landroidx/webkit/internal/a$f;

    const-string v1, "SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL"

    const-string v2, "SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL"

    invoke-direct {v0, v1, v2}, Landroidx/webkit/internal/a$f;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Landroidx/webkit/internal/j1;->z:Landroidx/webkit/internal/a$f;

    new-instance v0, Landroidx/webkit/internal/a$b;

    const-string v1, "WEB_MESSAGE_PORT_POST_MESSAGE"

    const-string v2, "WEB_MESSAGE_PORT_POST_MESSAGE"

    invoke-direct {v0, v1, v2}, Landroidx/webkit/internal/a$b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Landroidx/webkit/internal/j1;->A:Landroidx/webkit/internal/a$b;

    new-instance v0, Landroidx/webkit/internal/a$b;

    const-string v1, "WEB_MESSAGE_PORT_CLOSE"

    const-string v2, "WEB_MESSAGE_PORT_CLOSE"

    invoke-direct {v0, v1, v2}, Landroidx/webkit/internal/a$b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Landroidx/webkit/internal/j1;->B:Landroidx/webkit/internal/a$b;

    new-instance v0, Landroidx/webkit/internal/a$d;

    const-string v1, "WEB_MESSAGE_ARRAY_BUFFER"

    const-string v2, "WEB_MESSAGE_ARRAY_BUFFER"

    invoke-direct {v0, v1, v2}, Landroidx/webkit/internal/a$d;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Landroidx/webkit/internal/j1;->C:Landroidx/webkit/internal/a$d;

    new-instance v0, Landroidx/webkit/internal/a$b;

    const-string v1, "WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK"

    const-string v2, "WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK"

    invoke-direct {v0, v1, v2}, Landroidx/webkit/internal/a$b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Landroidx/webkit/internal/j1;->D:Landroidx/webkit/internal/a$b;

    new-instance v0, Landroidx/webkit/internal/a$b;

    const-string v1, "CREATE_WEB_MESSAGE_CHANNEL"

    const-string v2, "CREATE_WEB_MESSAGE_CHANNEL"

    invoke-direct {v0, v1, v2}, Landroidx/webkit/internal/a$b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Landroidx/webkit/internal/j1;->E:Landroidx/webkit/internal/a$b;

    new-instance v0, Landroidx/webkit/internal/a$b;

    const-string v1, "POST_WEB_MESSAGE"

    const-string v2, "POST_WEB_MESSAGE"

    invoke-direct {v0, v1, v2}, Landroidx/webkit/internal/a$b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Landroidx/webkit/internal/j1;->F:Landroidx/webkit/internal/a$b;

    new-instance v0, Landroidx/webkit/internal/a$b;

    const-string v1, "WEB_MESSAGE_CALLBACK_ON_MESSAGE"

    const-string v2, "WEB_MESSAGE_CALLBACK_ON_MESSAGE"

    invoke-direct {v0, v1, v2}, Landroidx/webkit/internal/a$b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Landroidx/webkit/internal/j1;->G:Landroidx/webkit/internal/a$b;

    new-instance v0, Landroidx/webkit/internal/a$e;

    const-string v1, "GET_WEB_VIEW_CLIENT"

    const-string v2, "GET_WEB_VIEW_CLIENT"

    invoke-direct {v0, v1, v2}, Landroidx/webkit/internal/a$e;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Landroidx/webkit/internal/j1;->H:Landroidx/webkit/internal/a$e;

    new-instance v0, Landroidx/webkit/internal/a$e;

    const-string v1, "GET_WEB_CHROME_CLIENT"

    const-string v2, "GET_WEB_CHROME_CLIENT"

    invoke-direct {v0, v1, v2}, Landroidx/webkit/internal/a$e;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Landroidx/webkit/internal/j1;->I:Landroidx/webkit/internal/a$e;

    new-instance v0, Landroidx/webkit/internal/a$h;

    const-string v1, "GET_WEB_VIEW_RENDERER"

    const-string v2, "GET_WEB_VIEW_RENDERER"

    invoke-direct {v0, v1, v2}, Landroidx/webkit/internal/a$h;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Landroidx/webkit/internal/j1;->J:Landroidx/webkit/internal/a$h;

    new-instance v0, Landroidx/webkit/internal/a$h;

    const-string v1, "WEB_VIEW_RENDERER_TERMINATE"

    const-string v2, "WEB_VIEW_RENDERER_TERMINATE"

    invoke-direct {v0, v1, v2}, Landroidx/webkit/internal/a$h;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Landroidx/webkit/internal/j1;->K:Landroidx/webkit/internal/a$h;

    new-instance v0, Landroidx/webkit/internal/a$g;

    const-string v1, "TRACING_CONTROLLER_BASIC_USAGE"

    const-string v2, "TRACING_CONTROLLER_BASIC_USAGE"

    invoke-direct {v0, v1, v2}, Landroidx/webkit/internal/a$g;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Landroidx/webkit/internal/j1;->L:Landroidx/webkit/internal/a$g;

    new-instance v0, Landroidx/webkit/internal/z0$b;

    const-string v1, "STARTUP_FEATURE_SET_DATA_DIRECTORY_SUFFIX"

    const-string v2, "STARTUP_FEATURE_SET_DATA_DIRECTORY_SUFFIX"

    invoke-direct {v0, v1, v2}, Landroidx/webkit/internal/z0$b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Landroidx/webkit/internal/j1;->M:Landroidx/webkit/internal/z0$b;

    new-instance v0, Landroidx/webkit/internal/z0$a;

    const-string v1, "STARTUP_FEATURE_SET_DIRECTORY_BASE_PATHS"

    const-string v2, "STARTUP_FEATURE_SET_DIRECTORY_BASE_PATH"

    invoke-direct {v0, v1, v2}, Landroidx/webkit/internal/z0$a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Landroidx/webkit/internal/j1;->N:Landroidx/webkit/internal/z0$a;

    new-instance v0, Landroidx/webkit/internal/a$h;

    const-string v1, "WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE"

    const-string v2, "WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE"

    invoke-direct {v0, v1, v2}, Landroidx/webkit/internal/a$h;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Landroidx/webkit/internal/j1;->O:Landroidx/webkit/internal/a$h;

    new-instance v0, Landroidx/webkit/internal/j1$a;

    const-string v1, "ALGORITHMIC_DARKENING"

    const-string v2, "ALGORITHMIC_DARKENING"

    invoke-direct {v0, v1, v2}, Landroidx/webkit/internal/j1$a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Landroidx/webkit/internal/j1;->P:Landroidx/webkit/internal/a$i;

    new-instance v0, Landroidx/webkit/internal/a$d;

    const-string v1, "PROXY_OVERRIDE"

    const-string v2, "PROXY_OVERRIDE:3"

    invoke-direct {v0, v1, v2}, Landroidx/webkit/internal/a$d;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Landroidx/webkit/internal/j1;->Q:Landroidx/webkit/internal/a$d;

    new-instance v0, Landroidx/webkit/internal/a$d;

    const-string v1, "SUPPRESS_ERROR_PAGE"

    const-string v2, "SUPPRESS_ERROR_PAGE"

    invoke-direct {v0, v1, v2}, Landroidx/webkit/internal/a$d;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Landroidx/webkit/internal/j1;->R:Landroidx/webkit/internal/a$d;

    new-instance v0, Landroidx/webkit/internal/a$d;

    const-string v1, "MULTI_PROCESS"

    const-string v2, "MULTI_PROCESS_QUERY"

    invoke-direct {v0, v1, v2}, Landroidx/webkit/internal/a$d;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Landroidx/webkit/internal/j1;->S:Landroidx/webkit/internal/a$d;

    new-instance v0, Landroidx/webkit/internal/a$h;

    const-string v1, "FORCE_DARK"

    const-string v2, "FORCE_DARK"

    invoke-direct {v0, v1, v2}, Landroidx/webkit/internal/a$h;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Landroidx/webkit/internal/j1;->T:Landroidx/webkit/internal/a$h;

    new-instance v0, Landroidx/webkit/internal/a$d;

    const-string v1, "FORCE_DARK_STRATEGY"

    const-string v2, "FORCE_DARK_BEHAVIOR"

    invoke-direct {v0, v1, v2}, Landroidx/webkit/internal/a$d;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Landroidx/webkit/internal/j1;->U:Landroidx/webkit/internal/a$d;

    new-instance v0, Landroidx/webkit/internal/a$d;

    const-string v1, "WEB_MESSAGE_LISTENER"

    const-string v2, "WEB_MESSAGE_LISTENER"

    invoke-direct {v0, v1, v2}, Landroidx/webkit/internal/a$d;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Landroidx/webkit/internal/j1;->V:Landroidx/webkit/internal/a$d;

    new-instance v0, Landroidx/webkit/internal/a$d;

    const-string v1, "DOCUMENT_START_SCRIPT"

    const-string v2, "DOCUMENT_START_SCRIPT:1"

    invoke-direct {v0, v1, v2}, Landroidx/webkit/internal/a$d;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Landroidx/webkit/internal/j1;->W:Landroidx/webkit/internal/a$d;

    new-instance v0, Landroidx/webkit/internal/a$d;

    const-string v1, "PROXY_OVERRIDE_REVERSE_BYPASS"

    const-string v2, "PROXY_OVERRIDE_REVERSE_BYPASS"

    invoke-direct {v0, v1, v2}, Landroidx/webkit/internal/a$d;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Landroidx/webkit/internal/j1;->X:Landroidx/webkit/internal/a$d;

    new-instance v0, Landroidx/webkit/internal/a$d;

    const-string v1, "GET_VARIATIONS_HEADER"

    const-string v2, "GET_VARIATIONS_HEADER"

    invoke-direct {v0, v1, v2}, Landroidx/webkit/internal/a$d;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Landroidx/webkit/internal/j1;->Y:Landroidx/webkit/internal/a$d;

    new-instance v0, Landroidx/webkit/internal/a$d;

    const-string v1, "ENTERPRISE_AUTHENTICATION_APP_LINK_POLICY"

    const-string v2, "ENTERPRISE_AUTHENTICATION_APP_LINK_POLICY"

    invoke-direct {v0, v1, v2}, Landroidx/webkit/internal/a$d;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Landroidx/webkit/internal/j1;->Z:Landroidx/webkit/internal/a$d;

    new-instance v0, Landroidx/webkit/internal/a$d;

    const-string v1, "GET_COOKIE_INFO"

    const-string v2, "GET_COOKIE_INFO"

    invoke-direct {v0, v1, v2}, Landroidx/webkit/internal/a$d;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Landroidx/webkit/internal/j1;->a0:Landroidx/webkit/internal/a$d;

    new-instance v0, Landroidx/webkit/internal/a$d;

    const-string v1, "REQUESTED_WITH_HEADER_ALLOW_LIST"

    const-string v2, "REQUESTED_WITH_HEADER_ALLOW_LIST"

    invoke-direct {v0, v1, v2}, Landroidx/webkit/internal/a$d;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Landroidx/webkit/internal/j1;->b0:Landroidx/webkit/internal/a$d;

    return-void
.end method

.method public static a()Ljava/lang/UnsupportedOperationException;
    .locals 2

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "This method is not supported by the current version of the framework and the current WebView APK"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public static b(Ljava/lang/String;Landroid/content/Context;)Z
    .locals 1

    invoke-static {}, Landroidx/webkit/internal/z0;->g()Ljava/util/Set;

    move-result-object v0

    invoke-static {p0, v0, p1}, Landroidx/webkit/internal/j1;->c(Ljava/lang/String;Ljava/util/Collection;Landroid/content/Context;)Z

    move-result p0

    return p0
.end method

.method public static c(Ljava/lang/String;Ljava/util/Collection;Landroid/content/Context;)Z
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Collection<",
            "Landroidx/webkit/internal/z0;",
            ">;",
            "Landroid/content/Context;",
            ")Z"
        }
    .end annotation

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/webkit/internal/z0;

    invoke-virtual {v1}, Landroidx/webkit/internal/z0;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_4

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/webkit/internal/z0;

    invoke-virtual {p1, p2}, Landroidx/webkit/internal/z0;->d(Landroid/content/Context;)Z

    move-result p1

    if-eqz p1, :cond_2

    const/4 p0, 0x1

    return p0

    :cond_3
    const/4 p0, 0x0

    return p0

    :cond_4
    new-instance p1, Ljava/lang/RuntimeException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Unknown feature "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static d(Ljava/lang/String;)Z
    .locals 1

    invoke-static {}, Landroidx/webkit/internal/a;->e()Ljava/util/Set;

    move-result-object v0

    invoke-static {p0, v0}, Landroidx/webkit/internal/j1;->e(Ljava/lang/String;Ljava/util/Collection;)Z

    move-result p0

    return p0
.end method

.method public static e(Ljava/lang/String;Ljava/util/Collection;)Z
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Landroidx/webkit/internal/n0;",
            ">(",
            "Ljava/lang/String;",
            "Ljava/util/Collection<",
            "TT;>;)Z"
        }
    .end annotation

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/webkit/internal/n0;

    invoke-interface {v1}, Landroidx/webkit/internal/n0;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_4

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/webkit/internal/n0;

    invoke-interface {p1}, Landroidx/webkit/internal/n0;->a()Z

    move-result p1

    if-eqz p1, :cond_2

    const/4 p0, 0x1

    return p0

    :cond_3
    const/4 p0, 0x0

    return p0

    :cond_4
    new-instance p1, Ljava/lang/RuntimeException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unknown feature "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
